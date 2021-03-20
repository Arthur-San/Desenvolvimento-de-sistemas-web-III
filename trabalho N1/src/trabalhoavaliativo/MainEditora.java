package trabalhoavaliativo;

import java.util.Scanner;
public class MainEditora {  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livros lr = new Livros();
        Editora e1 = new Editora();
        
        System.out.println("Qual o codigo do livro da Editora: ");
        lr.codigo = ler.nextInt();
        System.out.println("Descrição do livro: ");
        lr.descLivro = ler.next();
        System.out.println("Qual a ISBN do livro: ");
        lr.ISBN = ler.next();
        System.out.println("Qual o codigo da editora: ");
        e1.codEditora = ler.nextInt();
        System.out.println("Razão Social: ");
        e1.razaoSocial = ler.next();
        System.out.println("Qual o email da Editora: ");
        e1.email = ler.next();
        System.out.println("Telefone da Editora: ");
        e1.telefone = ler.next();
        
        
        System.out.println("Cadastro do Livro completo");
        System.out.println("*********************");
        System.out.println("Codigo do livro da Editora: " + lr.codigo);
        System.out.println("Dscrição do livro: " + lr.descLivro);
        System.out.println("O ISBN do livro: " + lr.ISBN);
        System.out.println("Codigo da editora: " + e1.codEditora);
        System.out.println("Razão Socail da Editora: " + e1.razaoSocial);
        System.out.println("Email da editora: " + e1.email);
        System.out.println("Telefone da Editora: " + e1.telefone);
        
    }
    
}
