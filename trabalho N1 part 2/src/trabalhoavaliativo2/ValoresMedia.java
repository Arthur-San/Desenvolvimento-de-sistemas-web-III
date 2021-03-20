/*
Crie um programa que leia "n" valores reais.
Quando o usuário informar um valor negativo o programa deve parar
de solicitar valores e exibir a média dos valores informados 
(Soma de todos os valores dividida pelo total de valores).
 */
package trabalhoavaliativo2;
import java.util.Scanner;
public class ValoresMedia {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double numero;
       double soma = 0;
       int cont = 0;
       
       do{
           System.out.println("Digite um numero: ");
           numero = ler.nextDouble();
           
           if(numero > 0){
               soma = numero + soma;
               cont ++;
           }
           
       }while (numero>0);
       System.out.println("Media dos valores digitados: " + soma/cont);
        
    }
    
}
