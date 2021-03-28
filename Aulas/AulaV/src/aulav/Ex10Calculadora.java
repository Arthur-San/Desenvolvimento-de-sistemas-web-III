/*
 * Ex10
Faça uma calculadora utilizando Java. Solicite ao usuário a entrada de 2 números reais. Apresente um menu de opções. Exemplo:  “Selecione a opção desejada:
1 - +  Soma de dois números
2 - -  Subtração de dois números
3 - *  Multiplicação de dois números
4 - /  Divisão de dois números

 */
package exerciciosoperadorescondicionais;

import java.util.Scanner;

public class Ex10Calculadora {    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int operacao, n1, n2;
        
        
        System.out.println("Digite os números que deseja executar um cálculo");
        n1 = ler.nextInt();
        System.out.println("Digite os números que deseja executar um cálculo");
        n2 = ler.nextInt();
        
        System.out.println("os seguintes números para identificação" + "\n" + "1 - SOMA" + "\n" + "2 - SUBTRAÇÃO" + "\n" + "3 - MULTIPLICAÇÃO" + "\n" + "4 - DIVISÃO");
        operacao = ler.nextInt();
        
        switch(operacao) {
            case 1:
                System.out.println("A esolha foi SOMA, a soma dos valores é: " + (n1 + n2));
                break;
             case 2:
                System.out.println("A esolha foi SUBTRAÇÃO, a subtração dos valores é: " + (n1 - n2));
                break;
             case 3:
                System.out.println("A esolha foi MULTIPLICAÇÃO, a multiplicação dos valores é: " + (n1 * n2));
                break;
             case 4:
                System.out.println("A esolha foi DIVISÃO, a divisão dos valores é: " + (n1 / n2));
                break;
                
            default:
                System.out.println("Valor digitado é INVÁLIDO");
                break;               
                
        }
        
        
    }
    
}
