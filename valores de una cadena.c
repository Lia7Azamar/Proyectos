#include <stdio.h>
#include <string.h>

int main() {
    char cadena[100];
    int i, vocales = 0;

    printf("Introduce una cadena de texto: ");
    fgets(cadena, sizeof(cadena), stdin);

    for (i = 0; i < strlen(cadena); i++) {
        char c = cadena[i];
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            vocales++;
        }
    }

    printf("La cadena contiene %d vocales.\n", vocales);

    return 0;
}