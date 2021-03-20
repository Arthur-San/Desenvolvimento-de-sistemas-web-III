package trabalhoavaliativo;
import java.util.Scanner;
public class Mercado {  
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produtos p1 = new Produtos();
        Carrinho c1 = new Carrinho();
        
        System.out.println("Bem vindo!");
        System.out.println("Porfavor digite o codigo do produto para adicionar no carrinho: ");
        p1.codigo = ler.nextInt();
        System.out.println("Qual da descrição do produto: ");
        p1.descProduto = ler.next();
        System.out.println("Qual preço do produto: ");
        p1.preco = ler.nextFloat();
        System.out.println("Quantidade que queria adicionar no carrinho: ");
        p1.quantidade = ler.nextInt();
        
        System.out.println(p1.listarDados());
        
        System.out.println("Quantos itens quer adicionar no carrinho: ");
        c1.itens = ler.nextInt();
        
        System.out.println(c1.Carrinho());
        
    }
    
}
