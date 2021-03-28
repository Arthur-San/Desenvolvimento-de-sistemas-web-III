/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09correcao;

public class Produto {
    public String produto;
    private double preco, vlrfinal;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getVlrfinal() {
        return vlrfinal;
    }

    public void setVlrfinal(double vlrfinal) {
        this.vlrfinal = vlrfinal;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    public String verificarDesconto(){
        String desconto;
        if(preco >= 1000)
        {
            desconto = "O produto tem desconto de 50% ";
        }else{
            desconto = "O produto não tem desconto";
        }
            return desconto;
    }
    
    public double calcularDesconto(){
        if(preco>=1000){
            vlrfinal = (preco * 0.5);            
       }else{
            vlrfinal = preco;
        }
            return vlrfinal;
    }
    
    
}
