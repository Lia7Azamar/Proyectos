
public class HiloRunnable implements Runnable {
    private  String corredor;
    private int noKm;

    public HiloRunnable(String corredor, int noKm){
        this.corredor=corredor;
        this.noKm=noKm;
    }

    @Override
    public void run() {
        for(int i=1; i<=noKm;i++){
            System.out.println(corredor+" alcanzò "+i+" km recorridos");
            try{
                Thread.sleep(1500);
            }catch(Exception err){
                System.out.println(err);
            }
        }
    }

    public static void main(String[] tesji){
        Thread corredor1 =new Thread(new HiloRunnable("Jehiel",10));
        Thread corredor2 =new Thread(new HiloRunnable("Fabiola",10));
        Thread corredor3 =new Thread(new HiloRunnable("Josue",10));
         corredor1.start();
         corredor2.start();
         corredor3.start();
    }

}
