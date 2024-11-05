#include <stdio.h>

int main() {
    char operador;
    double num1, num2, resultado;

    // Solicitar al usuario el primer número
    printf("Introduce el primer número: ");
    scanf("%lf", &num1);

    // Solicitar al usuario el operador
    printf("Introduce el operador (+, -, *, /): ");
    scanf(" %c", &operador);  // El espacio antes de %c es para consumir cualquier carácter de nueva línea previo

    // Solicitar al usuario el segundo número
    printf("Introduce el segundo número: ");
    scanf("%lf", &num2);

    // Realizar la operación según el operador
    switch (operador) {
        case '+':
            resultado = num1 + num2;
            break;
        case '-':
            resultado = num1 - num2;
            break;
        case '*':
            resultado = num1 * num2;
            break;
        case '/':
            if (num2 != 0)
                resultado = num1 / num2;
            else {
                printf("Error: División por cero no permitida.\n");
                return 1;  // Salir del programa con un código de error
            }
            break;
        default:
            printf("Operador no válido.\n");
            return 1;  // Salir del programa con un código de error
    }

    // Mostrar el resultado
    printf("Resultado: %.2lf\n", resultado);

    return 0;
}