/*
Criar um programa em Java que consistem em:
1 - Listar números de 1 a 50;
2 - Exibir a lista na horizontal e vertical;
3 - Exibir o tamanho da lista;
4 - Somar os valores da lista;

 */
package aula16arraylist;
import java.util.ArrayList;

public class ListarNumeros {
    public static void main(String[] args) {
        int soma = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("Numeros de 1 a 50 na horizontal: \n");
        for(int i = 1; i < 51; i++){    //Listar números de 1 a 50
            numeros.add(i);
        }System.out.println(numeros + "\n");
        
        System.out.println("Numeros de 1 a 50 na vertical: \n");
        for(int x : numeros){           //Listar números de 1 a 50
            System.out.println(x);
        }
        //Exibir o tamanho da lista
        System.out.println("\nO tamanho da lista é: " + numeros.size());
        
        //Somar os valores da lista
        for(int i = 0; i < 51; i++){
            soma = soma + i;
        }
        
        System.out.println("A soma de todos os números é: " + soma);
}
}