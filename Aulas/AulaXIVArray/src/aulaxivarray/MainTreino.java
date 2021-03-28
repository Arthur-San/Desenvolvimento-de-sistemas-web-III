
package aulaxivarray;
import java.util.Scanner;

public class MainTreino {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Treino t1 = new Treino();
        
        System.out.println("Informe o nome do atleta: ");
        t1.setNome(ler.nextLine());
        
            //for é o incremento que vai "contando" a 
            //quantidade de marcas que o usuário vai digitando
        for(int i = 0; i < 10; i++){
            System.out.println("Informe a marca e o atleta alcançou: " + i + ": ");
            t1.armazenaMarca(i,ler.nextDouble());            
        }
        
            //imprimindo na tela a invocação dos métodos 
            //para obtenção dos valores de média e maior marca
        System.out.println(t1);
        double media  = t1.calcularMediaDeMarcas();
        double maior = t1.obterMaiorMarca();
        
        System.out.println("Média atingida pelo atleta: " + media);
        System.out.println("maior marca atingida pelo atleta: " + maior);
        
        
    }
    
}
