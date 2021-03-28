/*
Soma de digitos
 */
package aulareforco;

public class SomaDigitos {

    public static void main(String[] args) {
        int i = 65;
        somaDigitos(i);        
    }
    private static void somaDigitos(int digitos){
        System.out.println("Digite um número " + digitos);
        int soma = 0;
        while (digitos > 0) {
            soma += digitos % 10;
            digitos /= 10;
            System.out.println("Digite de calcular: " + digitos);
        }
                
    }
    
}
