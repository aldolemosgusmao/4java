package br.com.4java.Exercicios;

public class Lampada{
    boolean status;

    public boolean ligar ( ){
        status = true;
        system.out.println ("O estado é ON");
        return status;
    }

    public boolean desligar ( ){
        status = false;
        system.out.println ("O estado é OFF");
        return status;
    }
}