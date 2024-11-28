.model small
.stack 64
.data
    prompt db "Ingrese una palabra:$"
    word db "hola$"         ; Cadena "hola" que se imprimir? en partes

.code
inicio:
    mov ax, @data
    mov ds, ax

    ; Mostrar mensaje de ingreso de palabra
    mov ah, 09h
    lea dx, prompt
    int 21h

    ; Salto de l?nea despu?s del mensaje
    mov ah, 02h
    mov dl, 0dh             ; Retorno de carro
    int 21h
    mov dl, 0ah             ; Nueva l?nea
    int 21h

    ; Imprimir "hola" en una sola l?nea
    mov ah, 09h
    lea dx, word
    int 21h

    ; Salto de l?nea despu?s de "hola"
    mov ah, 02h
    mov dl, 0dh             ; Retorno de carro
    int 21h
    mov dl, 0ah             ; Nueva l?nea
    int 21h

    ; Imprimir cada letra de "hola" en una l?nea nueva
    mov si, offset word     ; Apuntar al inicio de la palabra "hola"

imprimir_letras:
    mov dl, [si]            ; Obtener el car?cter actual
    cmp dl, '$'             ; Comprobar si hemos llegado al final de la cadena
    je fin                  ; Si es el s?mbolo $, terminar

    ; Imprimir el car?cter actual
    mov ah, 02h
    int 21h

    ; Salto de l?nea despu?s del car?cter
    mov dl, 0dh             ; Retorno de carro
    int 21h
    mov dl, 0ah             ; Nueva l?nea
    int 21h

    inc si                  ; Apuntar al siguiente car?cter en "hola"
    jmp imprimir_letras     ; Repetir el proceso para el siguiente car?cter

fin:
    ; Terminar el programa
    mov ax, 4C00h
    int 21h
end inicio
