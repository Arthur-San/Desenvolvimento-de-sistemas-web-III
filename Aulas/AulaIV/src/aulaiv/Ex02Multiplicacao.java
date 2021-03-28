/*
Faça um programa que leia três valores inteiros digitados
pelo usuário e retorne o resultado da multiplicação desses valores.
*/
package aulaiv;
import java.util.Scanner;

public class Ex02Multiplicacao {
static Scanner ler = new Scanner (System.in);
    int valor1,valor2,valor3    
    
    public static void main(String[] args) {
    
        System.out.println("Digite o Valor 1");
        int valor1 = ler.nextInt();
    
        System.out.println("Digite o Valor 2");
        int valor2 = ler.nextInt();
        
        System.out.println("Digite o Valor 3");
         int valor3 = ler.nextInt();
         
            System.out.println("O resultado da multiplicação é "+
                    (valor1 * valor2 * valor3));
    
    }
    
}
