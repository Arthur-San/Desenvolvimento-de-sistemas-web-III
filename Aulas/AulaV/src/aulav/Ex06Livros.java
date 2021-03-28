/*
 * Ex06
Criar um programa que leia quantos livros o usuário deseja comprar + o seu valor
e ofereça desconto. Se o usuário for comprar mais de 5 livros, ele receberá um desconto de 50%,
senão será o valor normal
 */
package exerciciosoperadorescondicionais;
import java.util.Scanner;

public class Ex06Livros {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        int livros;
        double preco;

        System.out.print("Quantos livros deseja comprar? ");
        livros = read.nextInt();
        System.out.print("Qual o valor do Livro? ");
        preco = read.nextDouble();

        if(livros >= 5) {
            System.out.println("O valor da compra é: " + ((livros * preco) - (livros * preco) * 0.50));
        }else{
            System.out.println("O valor da compra é: " + (livros * preco));
        }      
    }
}
