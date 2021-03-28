/*
Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o 
seu preenchimento automático com os números de 101 a 150, ou seja, na posição
número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente. 
Em seguida exiba os valores deste vetor.

 */
package aula_14_e_15;

public class Ex01 {

    public static void main(String[] args) {
       int[] x = new int[50];
       for(int i = 101; i <= 150; i++){
           x[i - 101] = i;
       }
       for(int i = 0; i <= 49; i++){
           System.out.println("Posição:     " + (i+1));
           System.out.println(x[i]);
       }
    }
    
}
