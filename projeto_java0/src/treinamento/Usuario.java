package treinamento;

public class Usuario {
    
    public static void main (String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Estado TV: "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("\nEstado TV: "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: "+smartTv.volume);

        smartTv.subirCanal();
        System.out.println("Canal: "+smartTv.canal);

        smartTv.mudarCanal(99);
        System.out.println("\nCanal: "+smartTv.canal);
    }

}
