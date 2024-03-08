import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;
public class MenuCodigos {
    public static void main(String[] args) {
        byte menu;
        menu = Byte.parseByte(JOptionPane.showInputDialog("Seleccione el codigo a ejecutar " +
                "\n 1-Tercera Parte \n 2-Carrera Tesji1 \n 3-Cafeteria Tesji" +
                "\n 4-Vestidos Swicth \n 5-ArbolNavidad \n 6-NumeroFactorial \n 7-Arreglos Uni \n 8-Arreglos Uni2 \n 9-Arreglos Bidi"));
        MenuCodigos papa = new MenuCodigos();
        MenuCodigos papa2 = new MenuCodigos();
        MenuCodigos papa3 = new MenuCodigos();
        MenuCodigos papa4 = new MenuCodigos();
        MenuCodigos papa5 = new MenuCodigos();
        MenuCodigos papa6 = new MenuCodigos();
        MenuCodigos papa7 = new MenuCodigos();
        MenuCodigos papa8 = new MenuCodigos();
        switch (menu) {
            case 1:
                //valor de retorno sin parametros
                float papas = papa.terceraParte();
                System.out.println("La mitad de la tercera parte del doble del numero ingresado es " + papas);
                break;
            case 2:
                //sin parametros ni valor de retorno
                papa2.carreratesji();
                break;
            case 3:
                //sin valor de retorno, con parametros
                papa3.cafeteriaTesji(200);
                break;
            case 4:
                //sin parametros ni valor de retorno
                papa4.vestidosSwich();
                break;
            case 5:
                //sin parametros ni valor de retorno
                papa5.arbolNavidad();
                break;
            case 6:
                //sin parametros ni valor de retorno
                papa5.numeroFactorial();
                break;
            case 7:
                //valor de retorno sin parametros
                float papas2 = papa7.arreglosUni();
                System.out.println("Tu calificaion final es "+papas2);
                break;
            case 8:
                //sin valor de retorno con parametros
                papa8.arreglosUni2(-1, 5);
                break;
            case 9:
                //sin valor de parametros ni retorno
                papa6.arregloBidi();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Usted eligio un programa fuera de la lista, reinicie el programa");
        }

    }

    /////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////
    public float terceraParte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entre 50 y 200");
        float p, c;
        int x, d;
        x = sc.nextShort();
        d = x * 2;
        p = d / 3;
        c = p / 2;
        return c;
    }

    /////////////////////////////////////////////////
    /////////////////////////////////////////////////
    public void carreratesji() {
        Scanner t = new Scanner(System.in);
        int si, cred2, s, si2, s2, si3, s3, cred3, x, t2, t3, t4, t5;
        int cred, taller;
        System.out.println("¿Asististe al desfile?, (presiona 1 para si,2 para no)");
        s = t.nextShort();
        si = s;
        cred = 1;
        cred3 = cred + cred;
        cred2 = cred + cred + cred;
        if (si == 1) {
            System.out.println("¿En que taller estas incrito? " +
                    "presiona 1-Danza, 2-Basquetbol, 3-Futbol, 4-TDK, 5-volley");
            x = t.nextShort();
            taller = x;
            t2 = x;
            t3 = x;
            t4 = x;
            t5 = x;
            if (taller == 1) {
                System.out.println("Tu taller es danza, deberas llevar el uniforme escolar al espectaculo");
            } else if (t2 == 2) {
                System.out.println("Tu taller es basquetbol, deberas ir de blanco al espectaculo");
            } else if (t3 == 3) {
                System.out.println("Tu taller es futbol, deberas ir de verde al espectaculo");
            } else if (t4 == 4) {
                System.out.println("Tu taller es TDK, deberas ir con el uniforme de tdk al espectaculo");
            } else if (t5 == 5) {
                System.out.println("Tu taller es volley, deberas ir de rojo al espectaculo");
            }
            System.out.println("Ganaste" + "_" + cred + "_" + "credito por asistir al desfile");
            System.out.println("¿Asististe a la carrera? preciona 1 para si,2 para no");
            s2 = t.nextShort();
            si2 = s2;
            if (si2 == 1) {
                System.out.println("Ganaste" + "_" + cred + "_" + "credito por asistir ala carrera");
                System.out.println("Quedaste entre los primeros 3? presiona 1 para si, 2 para no");
                s3 = t.nextShort();
                si3 = s3;
                if (si3 == 1) {
                    System.out.println("Ganaste" + "_" + cred + "_" + "credito por quedar en los primeros tres puestos");
                    System.out.println("Tienes en total" + "_" + cred2);
                } else System.out.println("Tienes en total" + "_" + cred3 + "creditos");
            } else System.out.println("Tienes en total" + "_" + cred + "creditos");
        } else System.out.println("tienes cero creditos");
    }

    ///////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////
    public void cafeteriaTesji(int produc) {
        Scanner t = new Scanner(System.in);
        int pelota, si;
        float des, pago, pago2;
        System.out.println("su total a pagar es de 200 a continuacion elija su descuento");
        System.out.println("¿De que color es tu pelota?, (presiona 1 para Verde, 2 para Amarilla y 3 para Roja)");
        pelota = t.nextShort();
        if (pelota == 1) {
            des = produc * 10;
            pago = des / 100;
            pago2 = produc - pago;
            System.out.println("Tienes un 10% de descuento en la cafeteria, tu pago es de " + pago2 + "_" + "  pesos");
        } else if (pelota == 2) {
            des = produc * 5;
            pago = des / 100;
            pago2 = produc - pago;
            System.out.println("Tienes un 5% de descuento en la cafeteria, tu pago es de " + pago2 + "_" + "pesos");
        } else if (pelota == 3) {
            des = produc * 15;
            pago = des / 100;
            pago2 = produc - pago;
            System.out.println("Tienes un 15% de descuento en la cafeteria, tu pago es de " + pago2 + "_" + "pesos");
        }
        System.out.println("Eres alumno de ingenieria en sistemas, presiona 1 para si, 2 para no");
        si = t.nextByte();
        if (si == 1) {
            System.out.println("Toma un jugito");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////
    public void vestidosSwich() {
        int cu, x,tallas;
        tallas = Byte.parseByte(JOptionPane.showInputDialog("¿Que talla vas a comprar? \n 1-talla " +
                "chica \n 2-Talla mediana \n 3-Talla grande"));
        switch (tallas) {
            case 1:
                cu = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero de prendas que compraste"));
                x = cu * 300;
                System.out.println("Su total a pagar es " + x);
                break;
            case 2:
                cu = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero de prendas que compraste"));
                x = cu * 400;
                System.out.println("Su total a pagar es " + x);
                break;
            case 3:
                cu = Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero de prendas que compraste"));
                x = cu * 500;
                System.out.println("Su total a pagar es " + x);
                break;
            default:
                System.out.println("reinicie el programa");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////
    public void arbolNavidad() {
        int a;
        a=12;
        System.out.println();
        for(int b=1; b<=a; b++){
            for(int c=1; c<=a-b; c++){
                System.out.print(" ");
            }
            for(int d=1; d<=(b*2)-1; d++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int e=1; e<=5; e++){
            System.out.println("         *****");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    public void numeroFactorial() {
        Scanner x = new Scanner(System.in);
        int a;
        int numero;
        System.out.print("Introduce un número ");
        numero=x.nextShort();
        a=1;
        for (int i=numero;i>0;i--) {
            a=a*i;
        }
        System.out.println("El factorial de " +numero+ " es " +a);
    }
    /////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    public float arreglosUni(){
        int i,arre1[]=new int[5];
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

        return x;
    }
    ////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////
    public void arreglosUni2(int w, int l){
        int i,j,k,   a1[]=new int[5], a2[]=new int[5], r[]=new int[5];
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
    //////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////
    public void arregloBidi(){
        int i,j,n[][]=new int[6][5];
        float x,y;
        x=0;
        y=0;
        String Materias[]={"Matematicas Discretas","Fundamentos de " +
                "programacion","Quimica","Calculo diferencial"
                ,"Fundamentos de investigacion","Desarrollo sustentable"};
        String U[]={"u1","u2","u3","u4","u5"};
        for(i=0;i<6;i++){
            for(j=0;j<5;j++){
                n[i][j]=Byte.parseByte(JOptionPane.showInputDialog("Cual fue tu " +
                        "calificacion en "+Materias[i]+" en la "+U[j]));
                System.out.print(U[j]+"="+n[i][j]+" ");
                x+=n[i][j];
            }
            x/=5;
            System.out.println();
            System.out.println("La calificacion de "+Materias[i]+" es "+x);
            System.out.println();
            y+=x;
            x=0;
        }
        y/=6;
        System.out.println("La calificacion final es "+y );
    }
}



