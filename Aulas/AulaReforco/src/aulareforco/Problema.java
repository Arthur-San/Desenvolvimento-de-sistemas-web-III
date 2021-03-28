/*
Faça um programa que receba somente nºs positivos e calcule:
-a soma dos numeros digitados
-a quantidade de números digitados
-a média dos números 
 */
package aulareforco;
import java.util.Scanner;
public class Problema {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double num, soma = 0;
        int cont = 0;
        
        do {
           System.out.println("Digite um nímero: ");
           num = ler.nextDouble();
           
           if(num >= 0){
               soma = num + soma;
               cont ++; //vai contar quantas vezes o usuário digitou o número
           }
        }while (num >= 0);
        System.out.println("A soma é: "+soma);
        System.out.println("A quantidade de números digitados é: "+cont);
        System.out.println("A média é: " + (soma / cont));
    }
    
}
