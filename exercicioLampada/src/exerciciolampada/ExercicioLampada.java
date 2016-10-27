/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolampada;

/**
 *
 * @author Aldo
 */
public class ExercicioLampada {
    boolean status;
    public boolean acender (){
        status = true;
        System.out.println("A Lâmpada está acesa!");
        return status;
    }
    
    public boolean apagar (){
        status = false;
        System.out.println("A lâmpada está apagada!");
        return status;
    }
    public static void main(String[] args) {
        
        
        ExercicioLampada L1 = new ExercicioLampada();
        ExercicioLampada L2 = new ExercicioLampada ();
        L1.acender();
        L2.apagar();
        
        
        
    }
    
}
