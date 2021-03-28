/*
(while) Escreva um programa Java capaz de
mostrar na tela do computador
os números inteiros PARES do intervalo[1,100]
 */
package aulax;
import java.util.Scanner;
public class SequenciaNumericaPares {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 0;
        
        while(x <= 100) {
            System.out.println("Os números pares de 1 à 100: " + x);
            x = x + 2;
        
    }
    
}
}