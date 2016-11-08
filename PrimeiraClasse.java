import java.util.Scanner;
public class PrimeiraClasse{
public static void main ( String[] args){

    Scanner entrada = new Scanner (System.in);
    String Nome;
    double NotaPort;
    double NotaMat;
    System.out.println ("Olá, é preciso inserir os dados iniciais, favor responder.");
    System.out.println ("Digite o nome do aluno.");
    Nome = entrada.nextLine();
    System.out.println ("Digite o nota de Portugûes.");
    NotaPort = entrada.nextDouble();
    System.out.println ("Digite o nota de Matemática.");
    NotaMat = entrada.nextDouble();
    System.out.println ("O nome do aluno � "+Nome);
    }
}