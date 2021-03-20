/*
 Verificar quantidade do Produto em estoque, e aprensenta se ha necessidade de solicitar mais;
 */
package trabalhoavaliativo2;

import java.util.Scanner;
public class Ex01Estoque {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String produto;
        int quant = 0;
         
        System.out.println("Digite o nome do produto: ");
        produto = ler.next();
        
        do{
            System.out.println("Digite o valor em estoque: ");
            quant = ler.nextInt();
            
            
        }while(quant<=0);
        
        System.out.println("Quantidade de " + produto + " em estoque: " + quant);
       
        if(quant>=10){
            System.out.println("Não a necessidade de reposição");
        }else{
            System.out.println("Porfavor solicite reposição");
        }
        
        
    }
    
}
