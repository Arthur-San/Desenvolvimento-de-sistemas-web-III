/*
(while) Escreva um programa Java capaz de 
mostrar na tela do computador a sequência 
de números de 1 a 100.*/

package aulax;
import java.util.Scanner;
public class SequênciaNumerica {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c = 0;
        
        while(c <= 1000) {
            System.out.println("Os números de 1 à 1000: " + c);
            c = c + 1;
        }
                
                
    }
    
}
