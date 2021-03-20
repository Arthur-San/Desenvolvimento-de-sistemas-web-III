/*
Crie um programa que receba vários números, calcule e mostre: 
a.A soma dos números digitados 
b.A quantidade de números digitados
c.A média dos números digitados
d.O maior número digitado
e.O menor número digitado


 */
package trabalhoavaliativo2;
import java.util.Scanner;
public class Calculo {   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, soma = 0, cont = 0, maior = 0, menor = 0;
        
        do{
            System.out.println("Digite um numero: ");;
            numero = ler.nextInt();
                
            if(numero>0){
                soma = numero + soma;
                cont++;
            }
            
            if(maior<numero){
                maior = numero;
            }
            
            if(menor>numero){
                menor = numero;
                
            }
            
            
        }while(numero>0);
        
        System.out.println("A soma dos números digitados: " + soma);
        System.out.println("Quantidade de numeros digitados: " + cont);
        System.out.println("Média dos numeros digitados: " + soma/cont);
        System.out.println("O maior numero digitado: " + maior );
        System.out.println("O menor valor digitado : " + menor);
    }
    
}
