package mama;

public class mama {
    public int atributo1,resultado;
    private int atributo2;
    protected int atributo3;

    int atributo4;
    public int atributop;
    public static void main(String[]args){
        hija1 hija1=new hija1();
        hija1.hija1_1();
        hija1.hija1_2();

        hija2 hija2=new hija2();
        hija2.hija2_1();
        hija2.hija2_2();

        señora señora=new señora();
        señora.señora1();
        señora.señora2();
    }
    public void metodo1(){
        atributo1=5;
        int re;
       hija1 t=new hija1();

       señora h=new señora();



    }
    public void metodo2(){
        atributo2=6;
        atributop=atributo2;
        hija2 y=new hija2();
        int a=y.prueba4;
    }
    public void metodo3(){
        atributo3=7;
    }
    public void metodo4() {
        atributo4=8;
    }
    public void metodo5(){
        System.out.println("llamando a la señora");
    }

}



