/*
 Criar um programa onde o usuário digita valores, é exibido a soma destes
 valores e é calulcado e exibido o valor de desconto = 20%
 */
package aulaii;

import java.util.Scanner;

public class Ex03Porcentagem {
    double valor1, valor2, valor3;
    static Scanner ler = new Scanner (System.in);
        
    public static void main(String[] args) {
        System.out.println("Digite o valor do primeiro produto: ");
        double valor1 = ler.nextDouble();
        
        System.out.println("Digite o valor do segundo produto: ");
        double valor2 = ler.nextDouble();
        
        System.out.println("Digite o valor do terceiro produto: ");
        double valor3 = ler.nextDouble();
        
        System.out.println("Ovalor total da compra é: " + (valor1 + valor2 + valor3));
        System.out.println("O valor do desconto é; " + (valor1 + valor2 + valor3) * 0.02);
        
        
    }
    
}
