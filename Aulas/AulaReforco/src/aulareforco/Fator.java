/*
Calcular fatorial
 */
package aulareforco;
import java.util.Scanner;
public class Fator {

    public static void main(String[] args) {
        Scanner ler  = new Scanner (System.in);
        
        
        
        System.out.println("Entre como um número positivo: ");
        int numero = ler.nextInt();
        long fatorial = 1;
        
        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial desse número é: " + fatorial);
    }
    
}
