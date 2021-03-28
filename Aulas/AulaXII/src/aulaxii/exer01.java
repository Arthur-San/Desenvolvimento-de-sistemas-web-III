/*
Faça um programa que receba somente nºs positivos e exibe e calcule:

a) o número digitado
b) a soma dos números digitados
c) a quantidade de números digitados
d) a média dos números digitados

 */
package aulaxii;
import java.util.Scanner;
public class exer01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //tipos de dados globais
        double numero, soma = 0;
        int cont = 0;
                
        //a) o número digitado               
        //System.out.println("Digite um número: ");
        //numero = ler.nextDouble();
        
        //b) a soma dos números digitados        
        do{
            System.out.println("Digite um número: ");
            numero = ler.nextDouble();
            
            if(numero > 0){
                soma = numero + soma;
                cont ++; //c) a quantidade de números digitados
            }                
        }while (numero > 0);
               
        
        System.out.println("O valor digitado foi: " + numero);
        System.out.println("A soma dos números digitados: " + soma);
        System.out.println("A quandidade de valores digitados: " + cont);
        System.out.println("A média de valores digitados: " + (soma/cont));
        
        
        
    }
}