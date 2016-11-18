/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Aldo
 */
class Pessoa {
   String CPF; 
   
       public void validaçãoCPF (String CPF){
          if (CPF.equals("00000000000")  || CPF.equals("11111111111") || CPF.equals("22222222222") 
            || CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555") 
            || CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
            || CPF.equals("99999999999") || CPF.length() !=11){
            System.out.println ("CPF Não Validado!");
            }
            
                
          
       }
}
