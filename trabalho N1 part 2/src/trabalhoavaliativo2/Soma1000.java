/*
 Imprima a soma de 1 até 1000.
 */
package trabalhoavaliativo2;


public class Soma1000 {

    public static void main(String[] args) {
       int y = 0, soma = 0, cont = 0;
       
       while(cont<1001){
           soma = soma + cont;
           cont++; 
       }
       
       System.out.println("Soma dos numeros de 1 ate 1000; " + soma);
    }
    
}
