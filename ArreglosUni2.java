import javax.swing.JOptionPane;
import java.util.Arrays;
public class ArreglosUni2 {
    public static void main(String[]args){

        int i,j,k,w,l,   a1[]=new int[5], a2[]=new int[5], r[]=new int[5];
        w=-1;
        l=5;
        for(i=0; i<5; i++){
            a1[i]=Byte.parseByte(JOptionPane.showInputDialog("Dame los valores del vector a1"));
        }
        for(j=0; j<5; j++){
            a2[j]=Byte.parseByte(JOptionPane.showInputDialog("Dame los valores del vector a2"));
        }
        for(k=0; k<5; k++){
            w+=+1;
            l+=-1;
            r[k]=a1[k]*a2[k+l-w];
        }
        System.out.println ("Las variables del vector a1 son "+ (Arrays.toString (a1) ));
        System.out.println("Las variables del vector a2 son "+(Arrays.toString (a2) ));
        System.out.println(Arrays.toString (r) );
    }
}
