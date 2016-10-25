package br.com.4java.Exercicios;

public class Lampada{
    boolean status;

    boolean ligar ( ){
        status = true;
        system.out.println ("O estado é ON");
        return status;
    }

    boolean desligar ( ){
        status = false;
        system.out.println ("O estado é OFF");
        return status;
    }
}