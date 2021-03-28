/*
Array list consultando um índice
 */
package aulaxvarraylist;
import java.util.ArrayList;
public class Exemplo02 {

    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
            cores.add("Branco");
            cores.add("Vermelho");
            cores.add("Roxo");
            cores.add("Azul");
        
            //impressão com consulta de valor do índice
            System.out.println(cores);
            
            System.out.println("Texto na posição 1 do ArrayList: " + cores.get(1));
            
    }
    
}
