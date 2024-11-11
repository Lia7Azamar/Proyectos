.model small
.stack 100h
.data
    msg1 db 'Ingrese el primer numero (0-9): $'
    msg2 db 'Ingrese el segundo numero (0-9): $'
    msg3 db 'La multiplicacion es: $'
    msg4 db 'La division es: $'
    msg5 db 'El modulo es: $'
    num1 db ?
    num2 db ?
    producto db ?
    cociente db ?
    resto db ?
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

    ; Convertir n?meros de car?cter a n?mero
    mov al, num1
    sub al, '0'          ; Convertir car?cter a n?mero
    mov bl, num2
    sub bl, '0'          ; Convertir car?cter a n?mero

    ; Multiplicaci?n
    mov ah, 0           ; Limpiar ah
    mul bl               ; AL = AL * BL (producto)
    mov producto, al

    ; Mostrar el resultado de la multiplicaci?n
    mov ah, 09h
    lea dx, msg3
    int 21h
    add producto, '0'
    mov dl, producto
    mov ah, 02h
    int 21h
    call imprimir_nueva_linea

    ; Divisi?n
    mov al, num1
    sub al, '0'          ; Convertir car?cter a n?mero
    mov bl, num2
    sub bl, '0'          ; Convertir car?cter a n?mero
    xor ah, ah          ; Limpiar ah para la divisi?n
    ; Asegurarse que el divisor no sea cero
    cmp bl, 0
    je division_error    ; Salta a error si el divisor es cero
    div bl               ; AL = AL / BL (cociente)
    mov cociente, al
    mov resto, ah        ; Resto en AH

    ; Mostrar el resultado de la divisi?n
    mov ah, 09h
    lea dx, msg4
    int 21h
    add cociente, '0'
    mov dl, cociente
    mov ah, 02h
    int 21h
    call imprimir_nueva_linea

    ; Mostrar el resto
    add resto, '0'
    mov dl, resto
    mov ah, 09h
    lea dx, msg5
    int 21h
    mov ah, 02h
    int 21h
    call imprimir_nueva_linea

    ; Esperar a que el usuario presione una tecla
    mov ah, 00h
    int 16h

    ; Salir del programa
    mov ax, 4C00h
    int 21h

division_error:
    ; Mensaje de error si el divisor es cero
    mov ah, 09h
    lea dx, msg2
    int 21h
    mov ah, 02h
    mov dl, '0'
    int 21h
    call imprimir_nueva_linea
    jmp start            ; Volver a empezar

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
