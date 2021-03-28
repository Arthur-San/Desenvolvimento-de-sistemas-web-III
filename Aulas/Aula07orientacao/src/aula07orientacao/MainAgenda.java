
package aula07orientacao;
import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Agenda a1 = new Agenda();
        
        System.out.println("Nome da pessoa");
            a1.setNome(ler.nextLine());
        System.out.println("Endereço da pessoa");
            a1.setEndereco(ler.nextLine());
        System.out.println("Telefone da pessoa");
            a1.setTelefone(ler.nextInt());
        System.out.println("Código da pessoa");
            a1.setCodigo(ler.nextInt());
    }
    
}
