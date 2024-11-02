#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_CONTACTS 100
#define NAME_LENGTH 50
#define PHONE_LENGTH 15
#define FILENAME "contacts.txt"

typedef struct {
    char name[NAME_LENGTH];
    char phone[PHONE_LENGTH];
} Contact;

void loadContacts(Contact contacts[], int *contactCount) {
    FILE *file = fopen(FILENAME, "r");
    if (!file) return;

    while (fscanf(file, "%49s %14s", contacts[*contactCount].name, contacts[*contactCount].phone) != EOF) {
        (*contactCount)++;
    }

    fclose(file);
}

void saveContacts(Contact contacts[], int contactCount) {
    FILE *file = fopen(FILENAME, "w");
    if (!file) {
        printf("Error al guardar los contactos.\n");
        return;
    }

    for (int i = 0; i < contactCount; i++) {
        fprintf(file, "%s %s\n", contacts[i].name, contacts[i].phone);
    }

    fclose(file);
}

void addContact(Contact contacts[], int *contactCount) {
    if (*contactCount >= MAX_CONTACTS) {
        printf("Agenda llena. No se pueden agregar más contactos.\n");
        return;
    }

    printf("Ingrese nombre: ");
    scanf("%49s", contacts[*contactCount].name);
    printf("Ingrese teléfono: ");
    scanf("%14s", contacts[*contactCount].phone);

    (*contactCount)++;
    saveContacts(contacts, *contactCount);
    printf("Contacto agregado con éxito.\n");
}

void viewContacts(Contact contacts[], int contactCount) {
    if (contactCount == 0) {
        printf("No hay contactos.\n");
        return;
    }

    printf("Lista de contactos:\n");
    for (int i = 0; i < contactCount; i++) {
        printf("Nombre: %s, Teléfono: %s\n", contacts[i].name, contacts[i].phone);
    }
}

void searchContact(Contact contacts[], int contactCount) {
    char name[NAME_LENGTH];
    printf("Ingrese el nombre del contacto a buscar: ");
    scanf("%49s", name);

    for (int i = 0; i < contactCount; i++) {
        if (strcmp(contacts[i].name, name) == 0) {
            printf("Contacto encontrado: %s - %s\n", contacts[i].name, contacts[i].phone);
            return;
        }
    }

    printf("Contacto no encontrado.\n");
}

void modifyContact(Contact contacts[], int contactCount) {
    char name[NAME_LENGTH];
    printf("Ingrese el nombre del contacto a modificar: ");
    scanf("%49s", name);

    for (int i = 0; i < contactCount; i++) {
        if (strcmp(contacts[i].name, name) == 0) {
            printf("Ingrese el nuevo teléfono: ");
            scanf("%14s", contacts[i].phone);
            saveContacts(contacts, contactCount);
            printf("Contacto modificado con éxito.\n");
            return;
        }
    }

    printf("Contacto no encontrado.\n");
}

void deleteContact(Contact contacts[], int *contactCount) {
    char name[NAME_LENGTH];
    printf("Ingrese el nombre del contacto a eliminar: ");
    scanf("%49s", name);

    for (int i = 0; i < *contactCount; i++) {
        if (strcmp(contacts[i].name, name) == 0) {
            for (int j = i; j < *contactCount - 1; j++) {
                contacts[j] = contacts[j + 1];
            }
            (*contactCount)--;
            saveContacts(contacts, *contactCount);
            printf("Contacto eliminado con éxito.\n");
            return;
        }
    }

    printf("Contacto no encontrado.\n");
}

int main() {
    Contact contacts[MAX_CONTACTS];
    int contactCount = 0;

    loadContacts(contacts, &contactCount);

    int option;
    do {
        printf("\n--- Agenda Telefónica ---\n");
        printf("1. Agregar contacto\n");
        printf("2. Ver contactos\n");
        printf("3. Buscar contacto\n");
        printf("4. Modificar contacto\n");
        printf("5. Eliminar contacto\n");
        printf("6. Salir\n");
        printf("Seleccione una opción: ");
        scanf("%d", &option);

        switch (option) {
            case 1:
                addContact(contacts, &contactCount);
                break;
            case 2:
                viewContacts(contacts, contactCount);
                break;
            case 3:
                searchContact(contacts, contactCount);
                break;
            case 4:
                modifyContact(contacts, contactCount);
                break;
            case 5:
                deleteContact(contacts, &contactCount);
                break;
            case 6:
                printf("Saliendo...\n");
                break;
            default:
                printf("Opción no válida.\n");
        }
    } while (option != 6);

    return 0;
}