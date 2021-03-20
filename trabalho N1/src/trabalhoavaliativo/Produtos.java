package trabalhoavaliativo;
public class Produtos {
   public int codigo, quantidade; 
   public String descProduto, dados;
   public float preco;
   
   public String listarDados(){
       if(codigo >0){
           System.out.println("Dados do seu produto: " + "\n" +  " Descrição do produto: "+ descProduto + "\n" + " Preço: " + preco +"\n" +   " Quantidae: " + quantidade);
       }else{
           System.out.println("Coleque um codigo valigo");
       }return dados;
   }
   
}
