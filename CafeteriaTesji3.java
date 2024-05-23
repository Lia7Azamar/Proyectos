import java.util.Scanner;
public class CafeteriaTesji3 {
    public static void main(String[]args){
        Scanner t = new Scanner(System.in);
        short pelota, si;
        float produc,des,pago,pago2;
        System.out.println("Incerta el total que vas a pagar para aplicar tu descuento");
        produc=t.nextShort();
        System.out.println("¿De que color es tu pelota?, (presiona 1 para Verde, 2 para Amarilla y 3 para Roja)");
        pelota=t.nextShort();
        if(pelota==1){
            des=produc*10;
            pago=des/100;
            pago2=produc-pago;
            System.out.println("Tienes un 10% de descuento en la cafeteria, tu pago es de "+pago2+"_"+"  pesos");
        }else if(pelota==2){
            des=produc*5;
            pago=des/100;
            pago2=produc-pago;
            System.out.println("Tienes un 5% de descuento en la cafeteria, tu pago es de "+pago2+"_"+"pesos");
        }else if(pelota==3){
            des=produc*15;
            pago=des/100;
            pago2=produc-pago;
            System.out.println("Tienes un 15% de descuento en la cafeteria, tu pago es de "+pago2+"_"+"pesos");
        }
        System.out.println("Eres alumno de ingenieria en sistemas, presiona 1 para si, 2 para no");
        si=t.nextByte();
        if(si==1){
            System.out.println("Toma un jugito");
    }

}

}
