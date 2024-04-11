package clases;

abstract class abstracta extends Triangulo{
    public abstract void imprimir();
    void bienbenida() {
        System.out.println("adhuwahdkjashkdasj");
    }
    public static void main(String[] args){
        Triangulo R1=new Triangulo();
        R1.cacularArea();
        Rectangulo r=new Rectangulo();
        r.cacularArea();
    }
}
