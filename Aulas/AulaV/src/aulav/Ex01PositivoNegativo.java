/*
 * Ex01
Crie um programa que leia um número inteiro digitado e retorne se o mesmo é 
positivo ou negativo.
 */
package exerciciosoperadorescondicionais;
import java.util.Scanner;

public class Ex01PositivoNegativo {
    int num;
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o número desejado: ");
        int num = ler.nextInt();
        
        if(num < 0) {
            System.out.println("O número que você digitou é negativo!");
        }else {
            System.out.println("O número que você digitou é positivo!");
        }
        
    }
    
}
