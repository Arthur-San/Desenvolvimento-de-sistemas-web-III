package trabalhoavaliativo;
public class Carrinho {
    public int itens;
    private String caixa;
    
    
    public String Carrinho(){
    if(itens <0){
        System.out.println("Porfavor adicione mais produtos! ");
    }else{
        System.out.println("Deseja realizar a compra: " + "\n" + "Sim" + "\n" + "Não");
    }return caixa;
   }
}
