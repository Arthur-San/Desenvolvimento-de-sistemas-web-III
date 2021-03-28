/*
 * Ex05
Faça um algoritmo que leia dois valores reais e exiba ao 
final qual dos dois é o maior.
 */
package exerciciosoperadorescondicionais;
import java.util.Scanner; 

public class Ex05MaiorMenor {
    int number1;
    int number2;
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        int local;	
		
		System.out.print("Digite o primeiro número:   \n");
		int number1 = ler.nextInt();
		System.out.print("Digite o segundo número:    \n");
		int number2 = ler.nextInt();
		
		
	if(number1 > number2) {
            local = number1;
        }else{
            local = number2;
        }	
       
        System.out.println("O maior número digitado foi: " + local);
		
    }
    
}
		
        
    

