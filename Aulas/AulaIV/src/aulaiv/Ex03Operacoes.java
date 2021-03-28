/*
 o dobro de "A"
 o triplo do dobro de "A"
 a metade do triplo do dobro de "A"
 o quadrado da variável "A" - Math.pow(número, potência);
 a quinta parte do dobro de "A"
 */
package aulaiv;
import java.util.Scanner;


public class Ex03Operacoes {
static Scanner ler = new Scanner (System.in);

    double valor1;

    public static void main(String[] args) {
    
        System.out.println("Digite o valor da variável: ");
        double valor1 = ler.nextDouble();
        
        System.out.println("-------------------");
        
        System.out.println("O dobro de " + valor1 + " é " + (valor1)*2);
        System.out.println("O triplo do dobro " + valor1 + " é " + (valor1 * 2) * 3);
        System.out.println("A metade do triplo do dobro de " + valor1 + " é " + ((valor1 * 2) * 3) / 2);
        System.out.println("O quadrado da variável " + valor1 + " é " + Math.pow( valor1 , 2);
        System.out.println("A quinta parte do dobro de " + valor1 + " é " + (valor1*2)/5;
            
    }
    
}
