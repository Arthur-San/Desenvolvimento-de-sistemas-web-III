/*
 * Ex09
Faça um algoritmo que leia a primeira letra do estado civil de uma pessoa e informe o estado civil.
1 - solteiro
2 - Casado
3 - Divorciado
4 - Viúvo
 */
package exerciciosoperadorescondicionais;
import java.util.Scanner;

public class Ex09EstadoCivil {    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int estado;
        
        System.out.println("Digite o estado cívil do cidadão");
        System.out.println("os seguintes números para identificação" + "\n" + "1 - solteiro" + "\n" + "2 - Casado" + "\n" + "3 - Divorciado" + "\n" + "4 - Viúvo");
        estado = ler.nextInt();
        
        switch(estado) {
            case 1:
                System.out.println("Solteiro");
                break;
            case 2:
                System.out.println("Casado");
                break;
            case 3:
                System.out.println("Divorciado");
                break;
            case 4:
                System.out.println("Viúvo");
                break;
                
            default:
                System.out.println("Digite SOMENTE números entre 1 e 4");
                break;
        
    }
    }
    
}
