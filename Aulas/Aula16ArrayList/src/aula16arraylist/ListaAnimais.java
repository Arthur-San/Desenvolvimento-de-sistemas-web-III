/*
ArrayList - com for
 */
package aula16arraylist;
import java.util.ArrayList;
public class ListaAnimais {

    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();
        animais.add("Gato");
        animais.add("Cachorro");
        animais.add("Macaco");
        animais.add("Tatu");
        animais.add("Jacaré");
        animais.add("Papagaio");
        animais.add("Cobra");
        animais.add("Crocodilo");
        System.out.println("Tamanho da lista");        
        System.out.println(animais.size());
        
        for(int i = 0; i < animais.size(); i++){
            System.out.println(animais.get(i));
        }
    }
    
}
