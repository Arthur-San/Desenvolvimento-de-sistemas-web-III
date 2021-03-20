package trabalhoavaliativo;

import java.util.Scanner;
public class ViagemMain {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       Viagem v1 = new Viagem();
       Vendedor v2 = new Vendedor();
       
       System.out.println("Nome do passageio: ");
       v1.setNome(ler.next());
       System.out.println("Destino: ");
       v1.Destino = ler.next();
       System.out.println("Duração da viagem: ");
       v2.setDuracao(ler.nextInt());
       System.out.println("Km percorrido na viagem: ");
       v2.setKm(ler.nextInt());
       System.out.println("Valor da passagem: ");
       v2.setValorVenda(ler.nextFloat());
       
       System.out.println("Dados da viagem: ");
       System.out.println("Destino: " + v1.Destino);
       System.out.println("Tempo de viagem previsto: " + v2.getDuracao() + "h");
       System.out.println("Km percorrido na viagem: " + v2.getKm());
       System.out.println("Valor completo da passagem: " + v2.getValorVenda());
       System.out.println("Cadastro de vaigem concluido com sucesso!!");
    }
    
}
