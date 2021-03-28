
package condicionais;
import java.util.Scanner;

public class BomDia {
    double hora;
    static Scanner ler = new Scanner (System.in);
            
    public static void main(String[] args) {
        System.out.println("Que horas são?");
        double hora = ler.nextDouble();
    
    //condicionais encadeadas
    if (hora <=12) {
        System.out.println("Bom dia!");
    }else if (hora <18){
        System.out.println("Boa tarde!");
    }else {
        System.out.println("Boa noite!");
    }
        
        
        
        
    }
    
}
