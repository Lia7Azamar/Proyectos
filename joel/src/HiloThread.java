public class HiloThread extends Thread{
    private int noGoles;
    private String equipo;

    public HiloThread(String equipo, int noGoles){
        this.equipo = equipo;
        this.noGoles = noGoles;
    }

    public void run(){
        for(int i=0; i <= noGoles; i++){
            System.out.println("Gol numero "+i+" del equipo "+equipo);
            try{
                Thread.sleep(1500);
            }catch (Exception err){
                System.out.println(err);
            }
        }
        System.out.println("Equipo Ganador " + equipo + "!!!");
    }
    public static void main(String[] tesji){
        HiloThread equipo1=new HiloThread("Barcelona",5);
        HiloThread equipo2=new HiloThread("Real Madrid",5);

        equipo1.start();
        equipo2.start();

    }
}