/*
Criar um programa onde é solicitado a digitação do nome do aluno com 3 notas.
O programa deverá retornar o nome e calcular a média aritimética deste aluno.
nota1 + nota2 + nota3 / 3
 */
package aulaii;
    import java.util.Scanner;

public class Ex07Media {
     int nome, nota1, nota2, nota3;
     static Scanner ler = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("nome do aluno");
        String nome = ler.nextLine();
        
        System.out.println("Nota 1");
        double nota1 = ler.nextDouble();
        
        System.out.println("Nota 2");
        double nota2 = ler.nextDouble();
        
        System.out.println("Nota 3");
        double nota3 = ler.nextDouble();
        
        System.out.println("Média do aluno "+ nome + " é " + (nota1+nota2+nota3) / 3);
        
    }
    
}
