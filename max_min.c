#include <stdio.h>

int main() {
    int n, i;
    int max, min;

    printf("Introduce el número de elementos: ");
    scanf("%d", &n);

    int arr[n];

    printf("Introduce los elementos del arreglo: \n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    max = min = arr[0];
    for (i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }

    printf("El valor máximo es: %d\n", max);
    printf("El valor mínimo es: %d\n", min);

    return 0;
}