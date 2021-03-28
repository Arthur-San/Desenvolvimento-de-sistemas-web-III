/*
 * Ex07
Crie um programa que leia o nome e a idade digitada pelo usuário, mais o valor
do ingresso de cinema. Se a pessoa for idosa (idade maior ou igual a 60), 
pagará a metade do ingresso.
 */
package exerciciosoperadorescondicionais;
import java.util.Scanner; 

public class Ex07Idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        double preco;
        
        System.out.println("Digite o nome do cliente: ");
        nome = ler.next();
        System.out.println("Digite a idade do cliente: ");
        idade = ler.nextInt();
        System.out.println("Digite o valor do ingresso: ");
        preco = ler.nextDouble();
        
        if(idade >= 60) {
            System.out.println("O valor a ser pago é: " + preco / 2);
        }else{
            System.out.println("O valor a ser pago é: " + preco);
        }
    }
    
}
