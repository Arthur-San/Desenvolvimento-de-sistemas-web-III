/*
 Algoritmo que retorna o nome e 
*/

package primeiroprojeto;

//importanção da classe Scanner. Captura os dadosas 
//informações e usuários que digitam no teclado
import java.util.Scanner;

// classe do Java
public class NomeIdade {
    //atributos: tipos de dados q o programa vai armazenar
    // String recebe valores de texto 
    String nome, sobrenome;
    
    //int recebe números inteiros 
    int idade;
    
    //double recebe valores decimais 
    double peso;
    
    static Scanner ler = new Scanner (System.in);
    
    //Aqui vai os métodos e lógica do meu algoritmo    
    public static void main (String [] args){
        
        //imprimir na tela a informação para o usuário
        System.out.println("Digite o seu nome: ");
        //atribuição do dado que o scanner vai ler
        String nome = ler.nextLine();
        
        System.out.println ("Digite o seu sobrenome: ");
        String sobrenome = ler.nextLine();
        
        System.out.println ("digite a sua idade: ");
        int idade = ler.nextInt();
        
        System.out.println ("Digite o seu peso");
        double peso = ler.nextDouble();        
              
    }
}