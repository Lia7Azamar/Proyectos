package clases;
import java.util.Scanner;
public class Triangulo implements Figura{
    Scanner x=new Scanner(System.in);
    @Override
    public void cacularArea() {
        int b,a,re;
        System.out.println("dime la base de tu triangulo");
        b=x.nextByte();
        System.out.println("dime la altura del triangulo");
        a= x.nextByte();
        re=b*a/2;
        System.out.println(re);

    }

}
