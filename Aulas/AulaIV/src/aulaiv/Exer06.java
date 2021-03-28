/*
Faça um algoritmo que leia um valor inteiro e 
retorne se este valor é PAR ou ÍMPAR.
*/

package aulaiv;
import java.util.Scanner;

public class Exer06 {
    int valor1;
    static Scanner ler = new Scanner (System.in);
        
    public static void main(String[] args) {
       System.out.println("Insira um valor para saber se ele é par ou ímpar");
       int valor1 = ler.nextInt();
       
       
       if((valor1 % 2) == 0) {
            System.out.println("O número " + valor1 + " é par");
       }else {
            System.out.println("O número " + valor1 + " é ímpar");}
       }
       
       
    }
    
}
