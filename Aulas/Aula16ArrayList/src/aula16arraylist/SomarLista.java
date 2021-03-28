/*
Somar a ArrayList
Armazena os dados do 1º ArrayList
Armazena os dados do 2º ArrayList
Usa o ArrayList com variável para executar a soma dos 2 ArrayList
 */
package aula16arraylist;
import java.util.ArrayList;
public class SomarLista {

    public static void main(String[] args) {
       //1º ArrayList
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(6);
        lista1.add(12);
        lista1.add(20);
        
       //2º ArrayList 
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(6);
        lista2.add(6);
        lista2.add(6);
        
        //ArrayList final que vai armazenar a soma dos 2
        ArrayList<Integer> fim = new ArrayList<>();
        int list1 = 0;
        int list2 = 0;
        
        System.out.println("A soma dos valores da lista é: ");
            for(int i = 0; i < lista1.size(); i++){
                list1 = lista1.get(i);
                    
            for(int j = i; j < lista2.size(); i++){
                list2 = lista2.get(j);
                }
                
        System.out.println();
                }                    
        
    }
    
}
