#include <stdio.h>
#include <string.h>

int main() {
    char str[100], temp;
    int i, j;

    printf("Introduce una cadena de texto: ");
    fgets(str, sizeof(str), stdin);

    // Eliminar el salto de línea
    str[strcspn(str, "\n")] = 0;

    // Invertir la cadena
    i = 0;
    j = strlen(str) - 1;
    while (i < j) {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
        i++;
        j--;
    }

    printf("Cadena invertida: %s\n", str);
    return 0;
}