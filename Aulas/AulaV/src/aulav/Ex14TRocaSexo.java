/*
 * Elabore um algoritmo que leia do teclado o sexo de uma pessoa. 
Se o sexo digitado for M ou F, escrever na tela “Sexo válido!”. 
Caso contrário, informar “Terceiro Sexo!”.

 */
package exerciciosoperadorescondicionais;
import java.util.Scanner;
public class Ex14TRocaSexo {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String teste, M, F;
       
       System.out.println("Digite o Sexo: " + "\n" + "F para feminino" + "\n" + "M para masculino");
       M = ler.next();
       F = ler.next();
       teste = ler.next();
       
       switch(teste) {
           case "M":
               System.out.println("Sexo Masculino");
               break;
           case "F":
               System.out.println("Sexo Feminino");
               break;
               
           default:
               System.out.println("Terceiro Sexo");
               
       }
       
       
       
    }
    
}
