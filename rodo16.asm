.model small
.stack 100h
.data
    msg1 db 'Introduce el primer numero: $'
    msg2 db 'Introduce el segundo numero: $'
    msgResult db 'El numero mayor es: $'
    newLine db 0Dh, 0Ah, '$'  ; Car?cter de salto de l?nea
    num1 db ?
    num2 db ?
    result db ?

.code
main:
    ; Inicializa el segmento de datos
    mov ax, @data
    mov ds, ax

    ; Solicita el primer n?mero
    mov dx, offset msg1
    mov ah, 09h
    int 21h

    ; Lee el primer n?mero
    mov ah, 01h
    int 21h
    sub al, 30h          ; Convierte de ASCII a n?mero
    mov num1, al

    ; Salto de l?nea despu?s del primer n?mero
    mov dx, offset newLine
    mov ah, 09h
    int 21h

    ; Solicita el segundo n?mero
    mov dx, offset msg2
    mov ah, 09h
    int 21h

    ; Lee el segundo n?mero
    mov ah, 01h
    int 21h
    sub al, 30h          ; Convierte de ASCII a n?mero
    mov num2, al

    ; Salto de l?nea despu?s del segundo n?mero
    mov dx, offset newLine
    mov ah, 09h
    int 21h

    ; Compara los n?meros
    mov al, num1
    cmp al, num2
    jge first_is_greater ; Salta aqu? si num1 >= num2

    ; Si num2 es mayor
    mov al, num2
    jmp display_result    ; Salta a la secci?n de mostrar el resultado

first_is_greater:
    ; num1 es mayor o igual
    mov al, num1          ; Asigna num1 a AL

display_result:
    ; Muestra el resultado
    mov result, al

    ; Imprimir mensaje de resultado
    mov dx, offset msgResult
    mov ah, 09h
    int 21h

    ; Imprimir el n?mero mayor
    add result, 30h      ; Convierte de n?mero a ASCII
    mov dl, result
    mov ah, 02h
    int 21h

    ; Salto de l?nea despu?s del resultado
    mov dx, offset newLine
    mov ah, 09h
    int 21h

    ; Salir del programa
    mov ah, 4ch
    int 21h
end main

