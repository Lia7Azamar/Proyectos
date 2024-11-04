.model small
.stack 100h
.data
    msg db 'Contando de 0 a 9:', 0dh, 0ah, '$'  ; Mensaje inicial
    number db '0', 0  ; Variable para almacenar el n?mero como string

.code
main proc
    mov ax, @data       ; Inicializa el segmento de datos
    mov ds, ax

    ; Mostrar mensaje inicial
    mov dx, offset msg  ; Cargar la direcci?n del mensaje
    mov ah, 09h         ; Funci?n de mostrar cadena
    int 21h             ; Llamada a la interrupci?n

    ; Contar de 0 a 9
    mov cx, 10          ; Contar 10 veces
    xor bl, bl          ; Inicializar el n?mero en 0

count_loop:
    ; Convertir el n?mero a ASCII
    add bl, '0'         ; Convertir el n?mero a car?cter ASCII
    mov number, bl      ; Almacenar el car?cter en la variable

    ; Mostrar el n?mero
    mov ah, 02h         ; Funci?n de mostrar car?cter
    mov dl, number      ; Cargar el n?mero en dl
    int 21h             ; Llamada a la interrupci?n

    ; Saltar a nueva l?nea
    mov dl, 13          ; Retorno de carro
    int 21h             ; Llamada a la interrupci?n
    mov dl, 10          ; Nueva l?nea
    int 21h             ; Llamada a la interrupci?n

    ; Preparar para el siguiente n?mero
    sub bl, '0'         ; Convertir de nuevo a n?mero
    inc bl              ; Incrementar para contar de 0 a 9
    loop count_loop     ; Repetir hasta que CX sea 0

    ; Finalizar el programa
    mov ah, 4Ch         ; Funci?n para terminar el programa
    int 21h             ; Llamada a la interrupci?n
main endp
end main
