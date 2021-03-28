/*
 * Ex04
Faça um algoritmo que leia um valor inteiro digitado 
e retorne se este valor é PAR ou ÍMPAR.
 */
package exerciciosoperadorescondicionais;
import java.util.Scanner;

public class Ex04ParImpar {
    int numero;
    static Scanner ler = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.println("Digite o valor desejado: ");
        int numero = ler.nextInt();
        
        if((numero %2) == 0) {
            System.out.println("Os números digitado é Par");
        }else {
            System.out.println("Os números digitado é Ímpar");
        }
    }
    
}
