/*
Faça um algoritmo que leia um valor inteiro e informe se este 
valor é maior do que 10 ou não.
 */
package aulaiv;
import java.util.Scanner;

public class Exer05 {
    int valor1;
    static Scanner ler = new Scanner (System.in);
        
    public static void main(String[] args) {
        System.out.println("Insira um valor para saber se é > ou < que 10");
        int valor1 = ler.nextInt();
        
    //condicionais encadeadas
    if (valor1 >10) {
        System.out.println("Este valor é ↑ que 10 ");
    }else {
        System.out.println("Este valor é ↓ que 10 ✕");
    }
        
    }
    
}
