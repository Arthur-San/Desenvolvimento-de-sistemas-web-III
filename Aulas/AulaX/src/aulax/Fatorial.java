
package aulax;

public class Fatorial {
   private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    public int calcularFatoriacao(){
        int numero = this.valor;
        int i = numero - 1;
        while (i > 0) {
            numero = numero * i;
            i --;
        }
        return numero;
    }
    
    
}   
