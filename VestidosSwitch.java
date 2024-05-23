import javax.swing.JOptionPane;
public class VestidosSwitch {
    public static void main(String[]args){
        byte tallas;
        int cu,x;

        tallas=Byte.parseByte(JOptionPane.showInputDialog("¿Que talla vas a comprar? \n 1-talla " +
                "chica \n 2-Talla mediana \n 3-Talla grande"));

        switch(tallas){
            case 1:
                cu=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero de prendas que compraste"));
                x=cu*300;
                System.out.println("Su total a pagar es "+x);
                break;
            case 2:
                cu=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero de prendas que compraste"));
                x=cu*400;
                System.out.println("Su total a pagar es "+x);
                break;
            case 3:
                cu=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero de prendas que compraste"));
                x=cu*500;
                System.out.println("Su total a pagar es "+x);
                break;
            default: System.out.println("reinicie el programa");





        }
    }
}
