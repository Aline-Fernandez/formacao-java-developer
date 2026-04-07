package edu.aline.sistema.smart.tv;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //---------------------canal-------------------
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);

    }

    //---------------------volume-------------------
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    //---------------------ligar e desligar-------------------
    public void ligar(){
        ligada = true;
    }
    public  void desligar(){
        ligada = false;
    }

    }
