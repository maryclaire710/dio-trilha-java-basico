public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        //smartTv.deligar();
        //System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual " + smartTv.volume);

       // smartTv.diminuirVolume();
       // System.out.println("Volume Atual" + smartTv.volume);

        smartTv.mudarCanal(81);
        System.out.println("Canal Atual " + smartTv.canal);

       // smartTv.aumentarCanal();
       // System.out.println("Canal Atual " + smartTv.canal);

       // smartTv.diminuirCanal();
       // System.out.println("Canal Atual " + smartTv.canal);

    }
}
