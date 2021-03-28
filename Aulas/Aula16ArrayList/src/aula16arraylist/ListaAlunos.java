/*
Classificar um ArrayList por nome 
usamos o package Collection: método sort(): classsifica os dados
do ArrayList em ordem crescente o ordem alfabética
 */
package aula16arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ListaAlunos {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Marcela");
        alunos.add("João");
        alunos.add("Josefa");
        alunos.add("Ze");
        alunos.add("Ana");
        alunos.add("Carlos");
        alunos.add("Tania");
        System.out.println(alunos.size());
        //pacote Colletions é responsável por incluir o método sort
        Collections.sort(alunos);
        for(String i : alunos) {
            System.out.println(i);
        }
    }
    
}
