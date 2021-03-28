/*
Criarum programa que o usuário digita qualquer número real e quando
digitar 0, o programa para e soma todos os valores os números digitados
 */
package aulaxii;
import java.util.Scanner;

public class SomarNumeros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
        double numero, soma = 0;
        
        
        
        do{
            System.out.println("Digite um número: ");
            numero = ler.nextDouble();
            
            if(numero > 0){
                soma = numero + soma;
                //cont ++;
            }
                
        }while (numero > 0);
        System.out.println("Soma de todos os números: " + soma);
    }
    
}
