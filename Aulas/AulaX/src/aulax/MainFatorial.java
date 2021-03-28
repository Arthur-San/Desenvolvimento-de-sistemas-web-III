
package aulax;
import java.util.Scanner;
public class MainFatorial {

    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        Fatorial fl = new Fatorial();
        
        System.out.println("Digite um valor: ");
        fl.setValor(ler.nextInt());
        
        System.out.println("\n O fatorial desde valor é: " + fl.calcularFatoriacao());
    }
    
}
