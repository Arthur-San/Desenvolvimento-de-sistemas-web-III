package aulaiv;
//importação da classe Scanner - /Lê o que foi digitado no teclado
import java.util.Scanner;

public class AulaIV {
    //atributos - variáveis - texto e número inteiro
    int idade;
    String nome;
    //instância da classe Scanner 
    //neste programa o Scanner vai ser chamado de "ler"
    
    static Scanner ler = new Scanner (System.in);
    
    public static void main(String[] args) {
    //print da tela do texto "Digite o seu nome"
        System.out.println("Digite o seu nome");
    //configurando a classe Scanner para ler o próximo texto
        String nome = ler.nextLine();
   
    //print da tela do texto "Digite a idade da pessoa: "    
        System.out.println("Digite a sua idade");
    //configurando a classe Scanner para ler o próximo dado inteiro    
        int idade  = ler.nextInt();
        
        System.out.println("****************************");
        System.out.println("Seu nome é " + nome);
        System.out.println("E você tem " + idade + " anos");
    }
    
}
