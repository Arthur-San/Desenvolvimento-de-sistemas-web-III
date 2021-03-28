/*
Crie um programa que leia um conjunto de notas, cuja quantidade 
seja determinada pelo usuário. Calcule a média de todas elas. Exiba
o conjunto das notas maiores do que a média calculada. Em seguida, de
forma agrupada, exiba o outro conjunto de notas (menores do que a média).
Vetor é Array
 */
package aula_14_e_15;
import java.util.Scanner;
public class Notas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade;
        double media = 0;
        
        System.out.println("Informe a quantidade de notas: ");
        quantidade = ler.nextInt();
        
        double vetor [] = new double [quantidade];
        
        for (int i = 1; 1 < quantidade; i++){
            System.out.println("Informe a " + i + "ª Nota");
            vetor[i] = ler.nextInt();
        }
        
        for(int i = 0; i < quantidade; i++){
            media = media + vetor[i];
        }
        media = media / quantidade;
        
        System.out.println("A média é:      " + media);
        String maior = "Nota assima da média", menor = "Nota abaixo da média: ";
        for(int i = 0; i < quantidade; i++){
            if(vetor[i] > media){
                maior = maior + vetor[i] + "        ";
            }else {
                menor = menor + vetor[i] + "";
            }
        }
        
        System.out.println(maior);
        System.out.println(maior);
    }
    
}
