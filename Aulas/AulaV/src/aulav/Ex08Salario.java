/*
 * Faça um programa que leia o Nome, Valor Hora e Total de Horas Trabalhadas de um funcionário. Calcule e exiba:
a)     O salário bruto
b)     O desconto de Imposto de Renda (11% do Salário Bruto para salários superiores a R$ 1650,00 ou ZERO caso o contrário)
c)     O salário líquido.

 */
package exerciciosoperadorescondicionais;
import java.util.Scanner;

public class Ex08Salario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        double vlrhora,horast;
        
        System.out.println("Digite o nome do Funcionário(a): ");
        nome = ler.next();
        
        System.out.println("Digite a o valor hora: ");
        vlrhora = ler.nextDouble();
        System.out.println("Digite q quantidade de horas que o funcionário trabalhou no mês: ");
        horast = ler.nextDouble();
        
        System.out.println("Visualizando os dados do Funcionário(a)");
        double salariob, salariol, ir;        
        salariob = vlrhora * horast;
        ir = salariob * 0.11;
        
        
        System.out.println("O salário Bruto do funcionário(a) é: " + salariob);
        
        if(salariob >= 1650) {
            System.out.println("O desconto de IR é: " + ir);
        }else{
            System.out.println("O Funcionário(a) não tem desconto de INSS");
        }
        
        System.out.println("O salário do funcionário(a): " + nome + "\n" + (salariob - ir));   
        
        
    }
    
}
