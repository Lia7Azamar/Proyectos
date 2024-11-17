#include <stdio.h>

int main() {
    int n, i;
    long long a = 0, b = 1, siguiente;

    printf("Introduce la cantidad de terminos de Fibonacci a generar: ");
    scanf("%d", &n);

    printf("Serie de Fibonacci:\n");
    for (i = 0; i < n; i++) {
        printf("%lld ", a);
        siguiente = a + b;
        a = b;
        b = siguiente;
    }
    printf("\n");

    return 0;
}