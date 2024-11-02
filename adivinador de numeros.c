#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void playGame() {
    int number, guess, attempts = 0;

    // Genera un número aleatorio entre 1 y 100
    srand(time(NULL));
    number = rand() % 100 + 1;

    printf("¡Bienvenido al juego de Adivina el Número!\n");
    printf("He elegido un número entre 1 y 100. ¿Puedes adivinar cuál es?\n");

    do {
        printf("Introduce tu intento: ");
        scanf("%d", &guess);
        attempts++;

        if (guess < number) {
            printf("Muy bajo. Intenta de nuevo.\n");
        } else if (guess > number) {
            printf("Muy alto. Intenta de nuevo.\n");
        } else {
            printf("¡Felicidades! Has adivinado el número en %d intentos.\n", attempts);
        }

    } while (guess != number);
}

int main() {
    char playAgain;

    do {
        playGame();
        printf("¿Quieres jugar de nuevo? (s/n): ");
        scanf(" %c", &playAgain);
    } while (playAgain == 's' || playAgain == 'S');

    printf("Gracias por jugar. ¡Hasta la próxima!\n");
    return 0;
}