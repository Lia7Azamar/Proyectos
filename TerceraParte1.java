import java.util.Scanner;
public class TerceraParte1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero entre 50 y 200");
        float p,c;
        int x,d;
        x=sc.nextShort();
        d=x*2;
        p=d/3;
        c=p/2;
        System.out.println("La mitad de la tercera parte del doble de "+x+"-es-"+c);
    }
}
