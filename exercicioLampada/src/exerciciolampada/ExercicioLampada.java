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
    String nome;
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
    public boolean alterarStatus (boolean status){
        if (status == true){
            status = false;
            System.out.println("Foi alterado para apagada");
        }else{
            status = true;
            System.out.println("Foi alterado para acesa");
        }
        return status;
    }
    public static void main(String[] args) {
        
        
        ExercicioLampada L1 = new ExercicioLampada();
        ExercicioLampada L2 = new ExercicioLampada ();
        L1.nome = "do quarto";
        L2.nome = "da sala";
        L1.acender();
        L2.apagar();
        System.out.println("Estado da Lâmpada "+L1.nome+": ");
        L1.alterarStatus(true);
        System.out.println("Estado da Lâmpada "+L2.nome+": ");
        L2.alterarStatus(true);
        
        Tv teve1 = new Tv();
        
        teve1.marca = "Toshiba";
        teve1.polegadas = "42";
        teve1.wifi = true;
        
        
        System.out.println(teve1.getDono());
        
        
        
    }
    
}
