
package aulax;
import java.util.Scanner;
public class Tabuada {

    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        int number;
        /*
        Array List que é responsável por armazaenar uma lista de atributos
        (variáveis)
        A declaração do Array, sempre começa com o tipo de dado que vai ser
        armazenado os "[]" que informa ao programa que será uma "Lista" de
        variáveis que o Java irá guardar.
        O construtor com a definição da quantidade de valores que serão 
        armazenados "[]"
        */
        
        int [] tabuada = new int [10];
        System.out.println("Tabuada: " + "\n");
        System.out.println("Insira um número: " + "\n");
        System.out.println(" **************** ");
        number = ler.nextInt();
        //i começa do zero, i menor do que o tamanho da tabuada; incrementa + in
        for(int i = 0; i < tabuada.length; i++){
            tabuada[i] = (i + 1);
            int resultado = (number * tabuada [i]);
            System.out.println(number + " x " + tabuada [i] + " = " + resultado);
        }
    }
    
}
