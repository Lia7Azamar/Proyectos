import javax.swing.JOptionPane;
import java.util.Arrays;
public class CALIFICACIONES2{
    public static void main(String[]args){
        int i,j , arre1[]=new int[5];
        float x;
        x=0;
        String titulos[]={"uni1","uni2","uni3","uni4","uni5"};
        for(i=0; i<5; i++){
            arre1[i]=Byte.parseByte(JOptionPane.showInputDialog("Dame la calificacion de la " +titulos[i]));
            x+=arre1[i];
            System.out.print(titulos[i]+"="+arre1[i]+" ");
        }
        System.out.println();
        x /= 5;
        System.out.println("Tu calificaion final es "+x);
    }

}
