#include <stdio.h>

int main() {
    int n;
    printf("Introduce el número de elementos en el arreglo: ");
    scanf("%d", &n);

    int arr[n];
    printf("Introduce %d números:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int max = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    printf("El número más grande en el arreglo es: %d\n", max);
    return 0;
}