import javax.swing.*;

public class a {

    public static void main(String[] args) {
        int f, c;
        f=Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de filas"));
        c=Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de columnas"));
        double matriz[][]=new double[f][c];
        String Filas[]={"fila 1 ","fila 2 ","fila 3 ","fila 4 ","fila 5 "};
        String Columnas[]={"columna 1","columna 2","columna 3","columna 4","columna 5"};
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                matriz[i][j]=Byte.parseByte(JOptionPane.showInputDialog("Dame los datos de la matriz 1 "+ Filas[i]+ Columnas[j]));
            }
        }
        double determinante = calcularDeterminante(matriz);

        System.out.println("El determinante de la matriz es: " + determinante);

    }

    public static double calcularDeterminante(double[][] matriz) {

        double determinante = 1;
        double n = matriz.length;

        for (int i = 0; i < n; i++) {

            int max = i;

            for (int j = i + 1; j < n; j++) {
                if (Math.abs(matriz[j][i]) > Math.abs(matriz[max][i])) {
                    max = j;
                }
            }

            if (i != max) {
                double[] temp = matriz[i];
                matriz[i] = matriz[max];
                matriz[max] = temp;
                determinante *= -1;
            }

            if (matriz[i][i] == 0) {
                return 0;
            }

            determinante *= matriz[i][i];

            for (int j = i + 1; j < n; j++) {
                double   factor = matriz[j][i] / matriz[i][i];
                for (int k = i; k < n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }

        }

        return determinante;
    }

}