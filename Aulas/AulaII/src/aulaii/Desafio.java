/*
 Criar um programa é solicitado ao usuário que digite o valor do raio de uma 
circunferência e o programa retorna o valor do diâmetro e de 1 quadrante
desta circunferência
 */
package aulaii;
import java.util.Scanner;


public class Desafio {
    int raio;
    static Scanner ler = new Scanner (System.in);
    
    
    public static void main(String[] args) {
    
        System.out.println("Digite o valor do raio da circunferência");
        double raio = ler.nextDouble();
        
        System.out.println("O valor do raio da circunferência é: " + raio);
        System.out.println("O valor do diâmetro da circunferência é: " + raio * 2);
        System.out.println("O valor do quadrante da circunferência é: " + (2 * raio) / 4);
   }
    
}
