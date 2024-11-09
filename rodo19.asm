.model small
.stack 64
.data
    msg db "PR?CTICA 7 Ing. y Esp. Rodolfo Guadalupe Alc?ntara Rosales$"    ; Mensaje a imprimir

.code
inicio:
    mov ax, @data
    mov ds, ax

    ; Mostrar mensaje
    mov ah, 09h
    mov dx, offset msg
    int 21h

    ; Salto de l?nea (nueva l?nea y retorno de carro)
    mov ah, 02h
    mov dl, 0ah          ; C?digo ASCII para nueva l?nea
    int 21h
    mov dl, 0dh          ; C?digo ASCII para retorno de carro
    int 21h

    ; Ciclo para mostrar cada car?cter de la cadena hasta '$'
    mov si, 0            ; ?ndice inicial del mensaje
ciclo:
    mov dl, msg[si]      ; Cargar car?cter actual en DL
    cmp dl, '$'          ; Verificar si es el car?cter de fin de cadena
    je fuera_ciclo       ; Si es '$', salir del ciclo

    mov ah, 02h
    int 21h              ; Mostrar el car?cter

    inc si               ; Incrementar ?ndice
    jmp ciclo            ; Repetir el ciclo

fuera_ciclo:
    ; Finalizar programa
    mov ax, 4c00h
    int 21h
end inicio
