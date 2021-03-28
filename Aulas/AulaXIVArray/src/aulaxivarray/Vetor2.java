
package aulaxivarray;
import java.util.Arrays;
import java.util.Scanner;

public class Vetor2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [] Valores = new int[8];
        for (int i = 0; i < 8; i++){
            System.out.println("Digite um número: ");
            Valores [i] = ler.nextInt();
        }
        
        System.out.println(Arrays.toString(Valores));
    }
    
}
