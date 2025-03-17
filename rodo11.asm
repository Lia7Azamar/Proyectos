.model small
.stack 100h
.data
    newline db 0Dh, 0Ah, '$'  ; Nueva l?nea

.code
main:
    ; Inicializar el segmento de datos
    mov ax, @data
    mov ds, ax

    ; Inicializar el contador en 99
    mov cx, 99

print_loop:
    ; Llamar a la funci?n para imprimir el n?mero en CX
    call print_number

    ; Imprimir un salto de l?nea
    mov ah, 09h
    lea dx, newline
    int 21h

    ; Decrementar el contador
    dec cx              ; Decrementar CX en 1
    cmp cx, 0          ; Comparar CX con 0
    jge print_loop      ; Si CX es mayor o igual a 1, repetir el bucle

    ; Terminar el programa
    mov ax, 4C00h
    int 21h

; Funci?n para imprimir un n?mero en el registro CX
print_number:
    push cx             ; Guardar CX en la pila
    xor dx, dx         ; Limpiar DX

    ; Convertir el n?mero en CX a ASCII
    mov ax, cx         ; Mover el n?mero a AX
    mov bx, 10         ; Divisor 10

convert_loop:
    xor dx, dx         ; Limpiar DX
    div bx              ; AX = AX / 10, DX = AX % 10
    push dx             ; Guardar el d?gito en la pila
    test ax, ax        ; Verificar si AX es 0
    jnz convert_loop    ; Si no es 0, continuar dividiendo

print_digits:
    pop dx              ; Recuperar el d?gito
    add dl, '0'        ; Convertir a ASCII
    mov ah, 02h        ; Funci?n de imprimir car?cter
    int 21h
    cmp sp, bp         ; Verificar si se han impreso todos los d?gitos
    jne print_digits    ; Si no, continuar imprimiendo

    pop cx              ; Recuperar CX
    ret

end main
