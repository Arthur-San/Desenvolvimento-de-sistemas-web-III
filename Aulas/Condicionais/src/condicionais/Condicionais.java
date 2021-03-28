
package condicionais;
import java.util.Scanner;

public class Condicionais {
    String nome;
    double media;
    static Scanner ler = new Scanner (System.in);
        
    public static void main(String[] args) {
        System.out.println("Digite o nome do aluno: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite a média do aluno");
        double media = ler.nextDouble();
        
        
        System.out.println("*****************************");
        if (media >=6) {
            System.out.println("O aluno está aprovado!");
       }else {
            System.out.println("O aluno está reprovado!");
        }
    }
    
}
