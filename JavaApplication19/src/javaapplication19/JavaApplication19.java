/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Aldo
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Pessoa nome = new Pessoa();
        System.out.println("Olá, este é um aplicativo teste.");
        System.out.println("Teste de validação de CPF");
        System.out.println("Digite o CPF:");
        nome.CPF = entrada.nextLine();
        System.out.println (" O número do CPF digitado foi " + nome.CPF);
        nome.validaçãoCPF(nome.CPF);
    }
    
}
