
/*(for) Escreva um programa Java para 
imprimir na tela todos os números ímpares
de 299 a 101 em ordem decrescente.*/

package aulaxi;
import java.util.Scanner;
public class Sequencia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int fim = 101;
        
        for (int i = 299; i >= fim; --i){
            System.out.println("Os números impares de 101 a 200 são: " + (i--));
		}
					
        }
			
}
    
    

