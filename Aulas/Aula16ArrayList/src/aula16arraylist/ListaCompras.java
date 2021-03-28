/*
Criar um programa em Java que consiste em uma lista de compras:

1 - Adicionar itens na lista de compras;
2 - Consultar itens pelo seu índice;
3 - Alterar itens da Lista de compras;
4 - Exibir o tamanho da lista de compras;
5 - Remover itens da lista de compras;
6 - Classificar em ordem alfabética
7 - Limpar a lista de compras
Obs: Criar uma interface que exibe o que está acontecendo com o programa

 */
package aula16arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ListaCompras {

    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        System.out.println("*****Lista de compras*****");
        produtos.add("Pizza");
        produtos.add("Sorvete");
        produtos.add("Lasanha");
        produtos.add("Água");
        System.out.println(produtos);           //lista de compras
        
        //Consultar itens pelo seu índice
        System.out.println("\n****Consultar itens pelo seu índice****");
        System.out.println("O item consultado é: " + produtos.get(2));    
        
        //Alterar itens da Lista de compras
        System.out.println("\n______Alterar itens de:______ ");
        System.out.println(produtos);
        System.out.println("\n______Para:______");
        produtos.set(3, "Coquinha gelada");
        System.out.println(produtos);
        
        //exibir o tamanho do ArrayList
        System.out.println("\nO tamanho da lista é: " + produtos.size());
        
        //Remover itens da lista de compras
        System.out.println("\n✖✖✖ Remover itens ✖✖✖");
        produtos.remove(3);
        System.out.println("A quantidade produtos que a minha lista tem é: " + produtos.size());
        
        //Classificar em ordem alfabética
        System.out.println("\n▷▷▷▷▷▷ ordem alfabética ◁◁◁◁◁◁");
        Collections.sort(produtos);
            for(String i : produtos){
                System.out.println(i);
            }
        //limpar tudo da lista de compra
        System.out.println("\n*****Removendo****");
        produtos.clear();
        System.out.println( produtos);    
    }
    
}
