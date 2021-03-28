/*
1 - Criar ArrayList
2 - Consultar um indice
3 - Mudando um indice
4 - Removendo um indice
5 - Consultar o tamanho do ArrayList
6 - Removendo todo o ArrayList
 */
package aula16arraylist;
import java.util.ArrayList;
public class ListaNomes {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("josefa");    //indice 0
        nomes.add("Marisa");    //indice 1
        nomes.add("Paulo");     //indice 2
        nomes.add("Roberto");   //indice 3
        
        //mudando um índice
        System.out.println(nomes);
        System.out.println("Mudando o nome do índice: ");
        
        //mudando um indice "set"
        nomes.set(1, "Mafalda");
        System.out.println(nomes);   
        
        //consultar um indice "get (numero do indice)"
        System.out.println("O nome na aposição 3 é: " + nomes.get(3));
        System.out.println("Removendo Roberto da Lista");
        
        //removendo um indice "remove"
        //o nome do ArrayList, o método e o nº do índice a ser excluido
        nomes.remove(3);
        System.out.println("A quantidade dedos que a minha lista tem é: ");
        
        //exibir o tamanho do ArrayList
        System.out.println(nomes.size());
        
        //removendo todo o ArrayList - "remove()"
        System.out.println("****Removendo****");
        nomes.clear();
        System.out.println(nomes);
        
        
        
    }
    
}
