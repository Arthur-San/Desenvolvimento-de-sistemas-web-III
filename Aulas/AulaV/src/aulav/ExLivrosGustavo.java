/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosoperadorescondicionais;

import java.util.Scanner;
public class ExLivrosGustavo {
    int livros;
    double v1;
    
    
    static Scanner ler= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quantos livros ira compra? ");
        int livros = ler.nextInt();
        
        System.out.println("Valor dos Livros:");
        double v1 = ler.nextDouble();
        
        if(livros >=5){
            System.out.println("O valor dos livros é" + (v1 - (v1 * 0.50)));
        }else{
            System.out.println("Valor dos seus livros é: " + v1);
        }
    }
    
}
