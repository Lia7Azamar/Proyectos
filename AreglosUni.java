import javax.swing.JOptionPane;
public class AreglosUni{
    public static void main(String[]args){
        byte i, arre1[]=new byte[5];
        int x;
        x=0;
        String titulos[]={"uni1","uni2","uni3","uni4","uni5"};
        for(i=0; i<5; i++){
            arre1[i]=Byte.parseByte(JOptionPane.showInputDialog("Dame la calificacion de la" +titulos[i]));
            x+=arre1[i];
        }
        x/=5;
        System.out.println(x);
    }

}
