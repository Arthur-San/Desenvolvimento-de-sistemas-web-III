
package aulaxivarray;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);        
            //definição do tipo de dado, nome e tamanho do Array
        double [] numeros = new double [10];
        System.out.println("Digite um número: ");
        numeros [10] = ler.nextDouble();
        
        System.out.println(Arrays.toString(numeros));
    }
    
}
