/*
Mudando um índice
 */
package aulaxvarraylist;
import java.util.ArrayList;
public class Exemplo03 {

    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
            cores.add("Branco");
            cores.add("Vermelho");
            cores.add("Roxo");
            cores.add("Azul");
            System.out.println("Alteração do ArrayList");
            //alterando dado de um índice
            //numero do indice e o nome que sera alterado
            cores.set(0,"Verde");            
            //remoção do indice
            System.out.println("Alteração do numero " + );
            cores.remove(3);
            
            //impressão com consulta de valor do índice
            System.out.println(cores);
            
            System.out.println("Texto na posição 1 do ArrayList: " + cores.get(1));
            
    }
    
}
