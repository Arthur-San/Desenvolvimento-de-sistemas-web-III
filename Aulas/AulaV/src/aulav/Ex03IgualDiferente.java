/*
 * Ex03
Faça um algoritmo que leia dois valores reais digitados 
e informe se estes valores são iguais ou diferentes.
 */
package exerciciosoperadorescondicionais;
import java.util.Scanner;

public class Ex03IgualDiferente {

    int n1, n2;
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o valor 1: ");
        int n1 = ler.nextInt();        
        System.out.println("Digite o valor 2: ");
        int n2 = ler.nextInt();
        
        if((n1 == n2)) {
            System.out.println("Os números digitados são iguais");
        }else {
            System.out.println("Os números digitados são diferentes");
        }
    }
    
}
