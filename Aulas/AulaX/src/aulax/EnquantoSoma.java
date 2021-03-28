
package aulax;
import java.util.Scanner;

public class EnquantoSoma {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int y, soma = 0, cont = 0;
        
        do {
            System.out.println("Digite um número: ");
            y = ler.nextInt();
            
            if(y > 0){
                soma = y + soma;
                cont ++;
            }
        }while (y > 0);
            System.out.println("Soma dos valores digitados " + soma);
    }
    
}
