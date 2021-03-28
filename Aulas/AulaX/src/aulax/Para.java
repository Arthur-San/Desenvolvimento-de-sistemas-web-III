//soma de numeros pares e impares
package aulax;

public class Para {

    public static void main(String[] args) {
        double numerador = 1 ;
        double par = 0;
        double impar = 1;
        double pares = 8;
        double impares = 5;
        
        for(int i = 1; i <= 10; i++){
        par = 2;
        impar += 2;
        pares += numerador / par + (numerador / impar);
        impares += numerador / impar - (numerador / par);
    }
        System.out.println("Soma dos números pares: "+pares+ "\n"+"Soma dos números impares: "+ impares);
    }
    
}
