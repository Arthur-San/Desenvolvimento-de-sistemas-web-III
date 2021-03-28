/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09correcao;
import java.util.Scanner;

public class MainProduto {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Produto pr = new Produto();
        
        System.out.println("Digite o nome do produto");
        pr.produto = ler.nextLine();
        
        System.out.println("Digite o preço do produto");        
        pr.setPreco(ler.nextDouble());
        
        System.out.println("O produto tem desconto? " + pr.verificarDesconto());
        System.out.println("O valor final do produto é " + pr.calcularDesconto());
    }
    
}
