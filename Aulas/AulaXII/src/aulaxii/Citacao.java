/*
Citar um programa que leia a aprtir de um nome digitado e retorne as iniciais
deste nome.
ex: Jacinto Silva Sauro - Sauro, S.J ou S. S. J.
 */
package aulaxii;
import java.util.Scanner;
public class Citacao {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        String iniciais = "";
        String nome;
        
        System.out.println("Digite um nome completo: ");
        nome = ler.nextLine().trim();
        
        int inicio = 0;
        int fim = nome.indexOf(" ", inicio);
        while (fim != -1) {
            iniciais += nome.substring(inicio, inicio +1) + ". ";
            inicio = fim + 1;
            fim = nome.indexOf(" ", inicio);
        }
        System.out.println(iniciais.toUpperCase());
    }
    
}
