.model small
.stack 100h
.data
    msg1 db 'Ingrese el primer numero (0-9): $'
    msg2 db 'Ingrese el segundo numero (0-9): $'
    msg3 db 'La resta es: $'
    num1 db ?
    num2 db ?
    resta db ?
    newline db 13, 10, '$' ; Car?cter de nueva l?nea

.code
start:
    ; Inicializar el segmento de datos
    mov ax, @data
    mov ds, ax

    ; Mostrar el mensaje para el primer n?mero
    mov ah, 09h
    lea dx, msg1
    int 21h

    ; Leer el primer n?mero
    call leer_numero
    mov num1, al
    call imprimir_nueva_linea ; Salto de l?nea

    ; Mostrar el mensaje para el segundo n?mero
    mov ah, 09h
    lea dx, msg2
    int 21h

    ; Leer el segundo n?mero
    call leer_numero
    mov num2, al
    call imprimir_nueva_linea ; Salto de l?nea

    ; Calcular la resta
    mov al, num1
    sub al, '0'          ; Convertir car?cter a n?mero
    mov bl, num2
    sub bl, '0'          ; Convertir car?cter a n?mero
    sub al, bl           ; Realizar la resta
    mov resta, al

    ; Mostrar el resultado
    mov ah, 09h
    lea dx, msg3
    int 21h

    ; Convertir resta a car?cter y mostrar
    add resta, '0'
    mov dl, resta
    mov ah, 02h
    int 21h

    ; Salto de l?nea despu?s de mostrar el resultado
    call imprimir_nueva_linea

    ; Esperar a que el usuario presione una tecla
    mov ah, 00h
    int 16h

    ; Salir del programa
    mov ax, 4C00h
    int 21h

leer_numero proc
    ; Leer un car?cter desde el teclado
    mov ah, 01h
    int 21h
    ret
leer_numero endp

imprimir_nueva_linea proc
    ; Imprimir un salto de l?nea
    mov ah, 09h
    lea dx, newline
    int 21h
    ret
imprimir_nueva_linea endp

end start
