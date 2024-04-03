import javax.swing.*;
public class Calculadora_Imaginarios{
    public static void main(String[]args) {
        byte menu;
        menu = Byte.parseByte(JOptionPane.showInputDialog("Seleccione el codigo a ejecutar " +
                "\n 1-Suma \n 2-Resta \n 3-Multiplicacion \n 4-Division"));
        Calculadora_Imaginarios suma= new Calculadora_Imaginarios();
        Calculadora_Imaginarios resta= new Calculadora_Imaginarios();
        Calculadora_Imaginarios multiplicacion= new Calculadora_Imaginarios();
        Calculadora_Imaginarios div= new Calculadora_Imaginarios();
        switch(menu) {
            case 1:suma.suma();
            break;
            case 2:resta.resta();
            break;
            case 3:multiplicacion.multiplicacion();
            break;
            case 4:div.division();
            break;

        }
    }
    public void suma(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números complejos a sumar"));
        int[] reales = new int[n];
        int[] imaginarios = new int[n];
        for (int i = 0; i < n; i++) {
            reales[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número real #" + (i+1)));
            imaginarios[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número imaginario #" + (i+1)));
        }
        int realTotal = 0;
        int imagTotal = 0;
        for (int i = 0; i < n; i++) {
            realTotal += reales[i];
            imagTotal += imaginarios[i];
        }
        System.out.println("El resultado de  la suma es: " + realTotal + " + " + imagTotal + "i");

    }
    public void resta(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de números complejos a restar"));
        int[] reales = new int[n];
        int[] imaginarios = new int[n];
        for (int i = 0; i < n; i++) {
            reales[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número real #" + (i+1)));
            imaginarios[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número imaginario #" + (i+1)));
        }
        int realTotal = 0;
        int imagTotal = 0;
        for (int i = 0; i < n; i++) {
            realTotal=(realTotal)-(reales[i]);
            if(i==0){
                realTotal=realTotal*-1;
            }
            imagTotal= (imagTotal)-(imaginarios[i]);
            if (i==0){
                imagTotal=imagTotal*-1;
            }
        }
        System.out.println("El resultado de  la resta es: " + realTotal + " - " + imagTotal + "i");

    }
    public void multiplicacion(){
        int r, r1, y, y1,real,imagi;
        r=Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero real"));
        y=Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero imaginario"));
        r1=Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero real"));
        y1=Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero imaginario"));
        real=r*r1-y*y1;
        imagi=r*y1+r1*y;
        System.out.println("el resultado de "+"("+r+" , "+y+"i"+")"+"*"+"("+r1+" , "+y1+"i"+") es "+"("+real+" , "+imagi+"i)");

    }
    public void division(){
        float r, r1, y, y1;
        float real,imagi;
        r=Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero real"));
        y=Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero imaginario"));
        r1=Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero real"));
        y1=Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero imaginario"));
        real=(r*r1+y*y1)/(r1*r1+y1*y1);
        imagi=(y*r1-r*y1)/(r1*r1+y1*y1);
        System.out.println("el resultado de "+"("+r+" , "+y+"i"+")"+"/"+"("+r1+" , "+y1+"i"+") es "+"("+real+" , "+imagi+"i)");

    }
}
