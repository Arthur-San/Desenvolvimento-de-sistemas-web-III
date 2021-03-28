/*
 *Exemplo
Digitar o número do mês do ano e o programa retorna o nome do mês
 */
package exerciciosoperadorescondicionais;

import java.util.Scanner;
public class TrocaMes {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int nomeMes;
       
       
       System.out.println("Digite o número do mês: ");
       nomeMes = ler.nextInt();
             
       //nesta linha fazemos a troca do valor da variável
       switch (nomeMes) {
           case 1:
               System.out.println("Janeiro");
               break;
           case 2:
               System.out.println("Fevereiro");
               break;
           case 3:
               System.out.println("Março");
               break;
           case 4:
               System.out.println("Abril");
               break;
               
           default:
               System.out.println("Não existe o mês");
               break;              
               
       }
       
       
       
    }
    
}
