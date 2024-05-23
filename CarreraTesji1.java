import java.util.Scanner;

public class CarreraTesji1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int si,cred2,s,si2,s2,si3,s3,cred3,x,t2,t3,t4,t5;
        int cred, taller;

        System.out.println("¿Asististe al desfile?, (presiona 1 para si,2 para no)");
        s = t.nextShort();
        si = s;
        cred =1;
        cred3=cred+cred;
        cred2=cred+cred+cred;

        if (si == 1) {
            System.out.println("¿En que taller estas incrito? " +
                    "presiona 1-Danza, 2-Basquetbol, 3-Futbol, 4-TDK, 5-volley");

            x = t.nextShort();
            taller = x;
            t2= x;
            t3=x;
            t4=x;
            t5=x;
            if (taller == 1) {
                System.out.println("Tu taller es danza, deberas llevar el uniforme escolar al espectaculo");
            }
            else if (t2 == 2) {
                System.out.println("Tu taller es basquetbol, deberas ir de blanco al espectaculo");
            }
            else if (t3 == 3) {
                System.out.println("Tu taller es futbol, deberas ir de verde al espectaculo");
            }
            else if (t4 == 4) {
                System.out.println("Tu taller es TDK, deberas ir con el uniforme de tdk al espectaculo");
            }
            else if (t5 == 5) {
                System.out.println("Tu taller es volley, deberas ir de rojo al espectaculo");
            }

            System.out.println("Ganaste" + "_" + cred +"_" +"credito por asistir al desfile");

            System.out.println("¿Asististe a la carrera? preciona 1 para si,2 para no");
        s2=t.nextShort();
        si2=s2;
            if (si2 == 1) {
                System.out.println("Ganaste" + "_" + cred + "_"+"credito por asistir ala carrera");




            System.out.println("Quedaste entre los primeros 3? presiona 1 para si, 2 para no");
        s3=t.nextShort();
        si3=s3;
            if (si3== 1) {
                System.out.println("Ganaste" + "_" + cred + "_"+"credito por quedar en los primeros tres puestos");
                System.out.println("Tienes en total" + "_" + cred2);


            }else  System.out.println("Tienes en total" + "_" + cred3+"creditos");


        } else System.out.println("Tienes en total" + "_" + cred+"creditos");
    }else  System.out.println("tienes cero creditos");

            }



    }
