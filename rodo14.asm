.MODEL SMALL
.STACK 100H

.DATA                   ; Comienza la secci?n de datos
NEWLINE DB 0DH, 0AH    ; Definici?n de nueva l?nea (CR LF)

.CODE                   ; Comienza la secci?n de c?digo

START:                  
    MOV AX, @DATA       ; Inicializa el segmento de datos
    MOV DS, AX

    MOV CX, 99          ; Inicia CX en 99 para contar desde 99
DESCEND:
    CALL PrintNumber     ; Llama a la rutina para imprimir el n?mero

    ; Imprimir salto de l?nea
    MOV AH, 02H          ; Servicio de impresi?n en pantalla
    MOV DL, 0DH          ; Retorno de carro (CR)
    INT 21H
    MOV DL, 0AH          ; Salto de l?nea (LF)
    INT 21H

    LOOP DESCEND         ; Decrementa CX y repite si CX > 0

    MOV AX, 4C00H        ; Termina el programa
    INT 21H

; Rutina para imprimir un n?mero de 2 d?gitos
PrintNumber PROC
    PUSH AX              ; Guardar AX
    PUSH CX              ; Guardar CX
    MOV AX, CX           ; Mover el valor de CX a AX
    XOR DX, DX           ; Limpiar DX para divisi?n

    ; Obtener decenas
    MOV BX, 10           ; Divisor para convertir a decimal
    DIV BX               ; AX / 10
    ADD DL, '0'          ; Convertir decenas a car?cter ASCII
    MOV AH, 02H          ; Servicio de impresi?n en pantalla
    INT 21H              ; Imprime la decena

    ; Obtener unidades
    MOV AL, AH           ; Mover el residuo (unidades) a AL
    ADD AL, '0'          ; Convertir unidades a car?cter ASCII
    INT 21H              ; Imprime la unidad

    POP CX               ; Restaurar CX
    POP AX               ; Restaurar AX
    RET
PrintNumber ENDP

END START               ; Finaliza el programa
