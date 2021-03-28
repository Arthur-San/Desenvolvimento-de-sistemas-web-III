/*
Criar um programa onde o usuário digita a largura e altura de um retângulo
o programa retorna o valor da área e depois o perimetro do retângulo
 */
package aulaii;
import java.util.Scanner;

public class Ex04Retangulo {
    int largura, altura;
    
    static Scanner ler = new Scanner (System.in);
       
    public static void main(String[] args) {
        System.out.println("Digite a largura do retângulo: ");
        int largura = ler.nextInt();
        
        System.out.println("Digite a altura do retângulo: ");
        int altura = ler.nextInt();
        
        System.out.println("visualizando os dados da forma geométrica");
        System.out.println("A área do retângulo é: " + (altura * largura));
        System.out.println("O perímetro do retângulo é: "+ (altura * largura) * 2);
        
        
    }
    
}
