import package br.com.4java.Exercicios;


public class TesteLampada{

    public static void main (String [] args){
        System.out.println ("Este programa controla o estado de uma lâmpada");
        Lampada L1 = new Lampada();
        L1.ligar();
        L1.desligar();
    }
}