
package javaapplication21;
import java.util.Scanner;

public class JavaApplication21 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nomeLivro,nomePessoa;
        int data;
        
        System.out.println("Digite o nome do livro");
        nomeLivro = ler.nextLine();
        
        
        System.out.println("Digite a data do livro");
        data = ler.nextInt();
        
        
        System.out.println("Nome do livro: " + nomeLivro);
        System.out.println("Data do livro: " + data);
    }
    
}
