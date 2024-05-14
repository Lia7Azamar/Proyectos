import java.util.Scanner;
class untitled {
    public static void main (String[]args){
        Scanner t=new Scanner(System.in);
        System.out.println("cuantos vestidos chicos compraste");
        System.out.println("cuantos vestidos medianos compraste");
        System.out.println("cuantos vestidos grandes compraste");


        int Ch,Me,Gr,P,P2,P3;
        int c,m,g;
        c=t.nextShort();
        m=t.nextShort();
        g=t.nextShort();

        Ch=c*300;
        Me=m*400;
        Gr=g*500;
        P=Me+Gr;
        P2=Gr+Ch;
        P3=Ch+Me;
        if(c>=1){
            System.out.println("pagaras"+Ch);
        }
        else if(m>=1){
            System.out.println("pagaras"+Me);
        }
            else if(g>=1){
                System.out.println("pagaras"+Gr);
        }
                else if(c<0 & m<0){
                    System.out.println("pagaras"+P);
        }
                    else if(m<0){
                        System.out.println("pagaras"+P2);
        }
                        else {
                            System.out.println("pagaras"+P3);
        }









    }
}