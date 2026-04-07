package edu.aline.sistema.smart.tv;

public class Usuario {

    public static void main(String[] args){

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual da TV: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual da TV : " + smartTv.canal);


        System.out.println("Volume atual da TV : " + smartTv.volume);


        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual da TV: " + smartTv.canal);
        System.out.println("Volume atual TV : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);
    }
}