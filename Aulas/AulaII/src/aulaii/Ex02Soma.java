/*
Criar um programa onde o usuário digita 2 valores e e o algoritmo 
retorna a soma
 */
package aulaii;
//importação da classe Scanner
import java.util.Scanner

public class Ex02Soma {
    double n1,n2;
    static Scanner ler = new Scanner (System.in)
    
    public static void main(String[] args) {
    
        System.out.println("Digite o primeiro valor");
        double n1 = ler.nextDouble();
        
        System.out.println("Digite o segundo valor");
        double n2 = ler.nextDouble();
        
        System.out.println("O resultado da soma é: " + (n1 + n2));
        
    }
    
}
