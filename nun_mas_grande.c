#include <stdio.h>

int main() {
    int n, i, max;
    printf("Cuantos numeros deseas ingresar?: ");
    scanf("%d", &n);

    int numeros[n];

    printf("Introduce %d numeros:\n", n);
    for (i = 0; i < n; i++) {
        printf("Numero %d: ", i + 1);
        scanf("%d", &numeros[i]);
    }

    max = numeros[0];
    for (i = 1; i < n; i++) {
        if (numeros[i] > max) {
            max = numeros[i];
        }
    }

    printf("El numero mas grande es: %d\n", max);

    return 0;
}