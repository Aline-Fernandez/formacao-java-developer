package edu.aline.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args){
        String nomeUm = "Aline";
        String nomeDois = new String("Aline");

        boolean resultado = nomeUm.equals(nomeDois);
        System.out.println( "nomeUm é igual a nomeDois? " + resultado);


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numero1 é igual numero2 ? " + simNao);


        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente numero2 ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior numero2 ? " + simNao);

    }
}