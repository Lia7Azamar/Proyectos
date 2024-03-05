public class AbolNavidad {

    public static void main(String[] args) {
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

}
