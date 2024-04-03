import javax.swing.*;

public class Calculadora {
    public static void main(String[]args) {
        byte menu;
        menu = Byte.parseByte(JOptionPane.showInputDialog("Seleccione el codigo a ejecutar " +
                "\n 1-Suma \n 2-Resta \n 3-Multiplicacion \n 4-Division"));
        Calculadora suma= new Calculadora();
        Calculadora resta= new Calculadora();
        Calculadora multiplicacion= new Calculadora();
        Calculadora a = new Calculadora();

        switch(menu) {
            case 1:suma.suma();
            break;
            case 2:resta.resta();
            break;
            case 3:multiplicacion.multiplicacion();
            break;



        }
    }
    public void suma(){
        int f,c;
        f=Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de filas"));
        c=Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de columnas"));
        int matriz1[][]=new int[f][c];
        int matriz2[][]=new int[f][c];
        int matriz_r[][]=new int[f][c];
        String Filas[]={"fila 1 ","fila 2 ","fila 3 ","fila 4 ","fila 5 "};
        String Columnas[]={"columna 1","columna 2","columna 3","columna 4","columna 5"};
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                matriz1[i][j]=Byte.parseByte(JOptionPane.showInputDialog("Dame los datos de la matriz 1 "+ Filas[i]+ Columnas[j]));
            }
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                matriz2[i][j]=Byte.parseByte(JOptionPane.showInputDialog("Dame los datos de la matriz 2 "+ Filas[i]+ Columnas[j]));
            }
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                matriz_r[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.print("[ " + matriz1[i][j] + " ]");
            }
            if(i==1){
                System.out.print("  +  ");
            }else {
                System.out.print("     ");
            }

            for(int j=0;j<c;j++){
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            if(i==1){
                System.out.print("  =  ");
            }else {
                System.out.print("     ");
            }
            for(int j=0;j<c;j++){
                System.out.print("[ " + matriz_r[i][j] + " ]");
            }
            System.out.println("");
        }
    }
    public void resta(){
        int f,c;
        f=Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de filas"));
        c=Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de columnas"));
        int matriz1[][]=new int[f][c];
        int matriz2[][]=new int[f][c];
        int matriz_r[][]=new int[f][c];
        String Filas[]={"fila 1 ","fila 2 ","fila 3 ","fila 4 ","fila 5 "};
        String Columnas[]={"columna 1","columna 2","columna 3","columna 4","columna 5"};
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                matriz1[i][j]=Byte.parseByte(JOptionPane.showInputDialog("Dame los datos de la matriz 1 "+ Filas[i]+ Columnas[j]));
            }
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                matriz2[i][j]=Byte.parseByte(JOptionPane.showInputDialog("Dame los datos de la matriz 2 "+ Filas[i]+ Columnas[j]));
            }
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                matriz_r[i][j]=matriz1[i][j]-matriz2[i][j];
            }
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.print("[ " + matriz1[i][j] + " ]");
            }
            if(i==1){
                System.out.print("  -  ");
            }else {
                System.out.print("     ");
            }

            for(int j=0;j<c;j++){
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            if(i==1){
                System.out.print("  =  ");
            }else {
                System.out.print("     ");
            }
            for(int j=0;j<c;j++){
                System.out.print("[ " + matriz_r[i][j] + " ]");
            }
            System.out.println("");
        }
    }
    public void multiplicacion(){
        int f, c, f1, c1, re;
        f = Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de filas de la matriz 1"));
        c = Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de columnas de la matriz 1"));
        f1 = Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de filas de la matriz 2"));
        c1 = Byte.parseByte(JOptionPane.showInputDialog("Dime el numero de columnas de la matriz 2"));
        int matriz1[][] = new int[f][c];
        int matriz2[][] = new int[f1][c1];
        int matriz_r[][] = new int[matriz1.length][matriz2.length];
        String Filas[] = {"fila 1 ", "fila 2 ", "fila 3 ", "fila 4 ", "fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ","fila 5 ",};
        String Columnas[] = {"columna 1", "columna 2", "columna 3", "columna 4", "columna 5","columna 5","columna 5","columna 5","columna 5","columna 5","columna 5","columna 5","columna 5","columna 5","columna 5","columna 5","columna 5","columna 5",};
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz1[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Dame los datos de la matriz 1 " + Filas[i] + Columnas[j]));
            }
        }
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c1; j++) {
                matriz2[i][j] = Byte.parseByte(JOptionPane.showInputDialog("Dame los datos de la matriz 2 " + Filas[i] + Columnas[j]));
            }


        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                re=0;
                for(int k = 0; k < matriz2.length; k++){
                    re += matriz1[i][k] * matriz2[k][j];
                }
                matriz_r[i][j]=re;
            }
        }
        for(int i=0;i< matriz1.length;i++){
            for(int j=0;j< matriz1.length;j++){
                System.out.print("[ " + matriz1[i][j] + " ]");
            }
            if(i==1){
                System.out.print("  *  ");
            }else {
                System.out.print("     ");
            }

            for(int j=0;j< matriz2.length;j++){
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            if(i==1){
                System.out.print("  =  ");
            }else {
                System.out.print("     ");
            }
            for(int j=0;j< matriz_r.length;j++){
                System.out.print("[ " + matriz_r[i][j] + " ]");
            }
            System.out.println("");
        }
    }


}
