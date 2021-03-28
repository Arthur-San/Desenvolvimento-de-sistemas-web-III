/*
ArrayList com tipo de dados inteiros - Integer
int para ArrayList é Integer
 */
package aula16arraylist;
import java.util.ArrayList;

public class Numeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(100);
        numeros.add(150);
        numeros.add(200);
        numeros.add(250);
        numeros.add(1234);
        System.out.println(numeros);
        
        for(int i : numeros){
            System.out.println(i);
        }
        
    }
    
}
