/*
Gravar dados do ArrayList usando Classe Scanner
 */
package aula17arraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class GravarLista {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList <Integer> lista = new ArrayList<>();
        
        System.out.println("Gravando dados do ArrayList com o Scanner: ");
        System.out.println("\nDigite 0 quando desejar finalizar a lista...");
        //declaração dos dados digitados e inseridos no ArrayList
        for(int i = 0; i < 15; i++){
            System.out.println("Digite um número para inserir na lista: ");
            int num1 = ler.nextInt();            
            if(num1 == 0){
                break;
            }
            lista.add(num1);
            }
        int tamanho = lista.size();
        System.out.println("A quantidade de numeros na lista é: " + tamanho);
        
        System.out.println("Os valores digitados foram: ");        
        for(Integer integer : lista) {
            System.out.println(integer);
        }
    }
    
}
