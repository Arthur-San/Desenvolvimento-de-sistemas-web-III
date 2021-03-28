/*
 * Ex02
Faça um algoritmo que leia um valor inteiro digitado 
e informe se este valor é maior do que 10 ou não.
 */
package exerciciosoperadorescondicionais;

import java.util.Scanner;

public class Ex02Maiorque10 {

    int valor;
    static Scanner ler = new Scanner(System.in);
            
    public static void main(String[] args) {
        System.out.println("Digite o número desejado: ");
        int valor = ler.nextInt();
        
        if(valor >= 10) {
            System.out.println("O número que você digitou é maior ou igual a 10");
        }else {
            System.out.println("O número que você digitou é menor do que 10!");
        }
    }
    
}
