package clases;
import java.util.Scanner;
public class Rectangulo implements Figura {
    public void cacularArea() {
        Scanner x=new Scanner(System.in);
        int b,a,re;
        System.out.println("dime la base de tu rectangulo");
        b=x.nextByte();
        System.out.println("dime la altura del rectangulo");
        a= x.nextByte();
        re=b*a;
        System.out.println(re);
    }
}
