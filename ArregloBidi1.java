import javax.swing.*;
public class ArregloBidi1 {
    public static void main(String[]args){
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
            System.out.println(8
            );
            y+=x;
            x=0;
        }
        y/=6;
        System.out.println("La calificacion final es "+y );
    }
}