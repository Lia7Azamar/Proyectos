#include <stdio.h>
#include <stdlib.h>
#include <ncurses.h>
#include <unistd.h>
#include <time.h>

#define WIDTH 20
#define HEIGHT 20
#define DELAY 100000  // Microsegundos entre movimientos (mayor es más lento)

typedef struct {
    int x, y;
} Position;

typedef struct {
    Position positions[WIDTH * HEIGHT];
    int length;
    Position direction;
} Snake;

void initializeGame(Snake *snake, Position *food) {
    snake->length = 1;
    snake->positions[0].x = WIDTH / 2;
    snake->positions[0].y = HEIGHT / 2;
    snake->direction.x = 1;  // La serpiente empieza moviéndose hacia la derecha
    snake->direction.y = 0;

    srand(time(NULL));
    food->x = rand() % WIDTH;
    food->y = rand() % HEIGHT;
}

void drawGame(Snake *snake, Position *food) {
    clear();
    
    // Dibujar paredes
    for (int i = 0; i <= WIDTH + 1; i++) {
        mvprintw(0, i, "#");
        mvprintw(HEIGHT + 1, i, "#");
    }
    for (int i = 0; i <= HEIGHT + 1; i++) {
        mvprintw(i, 0, "#");
        mvprintw(i, WIDTH + 1, "#");
    }
    
    // Dibujar comida
    mvprintw(food->y + 1, food->x + 1, "*");
    
    // Dibujar serpiente
    for (int i = 0; i < snake->length; i++) {
        mvprintw(snake->positions[i].y + 1, snake->positions[i].x + 1, "O");
    }
    
    refresh();
}

void updateSnake(Snake *snake, Position *food) {
    // Mover el cuerpo de la serpiente
    for (int i = snake->length - 1; i > 0; i--) {
        snake->positions[i] = snake->positions[i - 1];
    }

    // Mover la cabeza de la serpiente
    snake->positions[0].x += snake->direction.x;
    snake->positions[0].y += snake->direction.y;

    // Comprobar si la serpiente come la comida
    if (snake->positions[0].x == food->x && snake->positions[0].y == food->y) {
        snake->length++;
        food->x = rand() % WIDTH;
        food->y = rand() % HEIGHT;
    }
}

int checkCollision(Snake *snake) {
    // Verificar si la serpiente colisiona con los muros
    if (snake->positions[0].x < 0 || snake->positions[0].x >= WIDTH ||
        snake->positions[0].y < 0 || snake->positions[0].y >= HEIGHT) {
        return 1;
    }
    
    // Verificar si la serpiente colisiona consigo misma
    for (int i = 1; i < snake->length; i++) {
        if (snake->positions[0].x == snake->positions[i].x &&
            snake->positions[0].y == snake->positions[i].y) {
            return 1;
        }
    }

    return 0;
}

void changeDirection(Snake *snake, int input) {
    switch (input) {
        case KEY_UP:
            if (snake->direction.y == 0) {  // Evitar reversa
                snake->direction.x = 0;
                snake->direction.y = -1;
            }
            break;
        case KEY_DOWN:
            if (snake->direction.y == 0) {
                snake->direction.x = 0;
                snake->direction.y = 1;
            }
            break;
        case KEY_LEFT:
            if (snake->direction.x == 0) {
                snake->direction.x = -1;
                snake->direction.y = 0;
            }
            break;
        case KEY_RIGHT:
            if (snake->direction.x == 0) {
                snake->direction.x = 1;
                snake->direction.y = 0;
            }
            break;
    }
}

int main() {
    Snake snake;
    Position food;
    int input;

    initscr();
    curs_set(FALSE);
    noecho();
    keypad(stdscr, TRUE);
    timeout(0);  // Hacer que getch() sea no bloqueante

    initializeGame(&snake, &food);

    while (1) {
        input = getch();
        if (input == 'q') break;  // Presionar 'q' para salir del juego
        changeDirection(&snake, input);

        updateSnake(&snake, &food);
        if (checkCollision(&snake)) {
            mvprintw(HEIGHT / 2, WIDTH / 2 - 5, "¡Juego terminado!");
            refresh();
            usleep(2000000);
            break;
        }
        
        drawGame(&snake, &food);
        usleep(DELAY);
    }

    endwin();
    return 0;
}