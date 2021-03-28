
package aulaxivarray;
import java.util.Arrays;
public class Treino {
    //atributos
    private String nome;
    //declaração do Array
    //tipo de dado "[]" definem que é um Array e o nome do Array
    private double[] marcas;
    
    
    //métodos 
    public Treino(){
        this.marcas = new double [10];
    }
    //métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getMarcas() {
        return marcas;
    }

    public void setMarcas(double[] marcas) {
        this.marcas = marcas;
    }
    //métodos de cálculo
    public void armazenaMarca(int numero, double marca){
        if(numero >= 0 && numero < this.marcas.length){
            this.marcas [numero] = marca;
        }
    }    
    public double calcularMediaDeMarcas(){
        double soma = 0;
        for(int i = 0; i < this.marcas.length; i++){
            soma = soma + this.marcas[i];
    }
    return soma / this.marcas.length;   
}
    
    public double obterMaiorMarca(){
        double maior = this.marcas[0];
        for(int i = 1; i < this.marcas.length; i++){
            if(this.marcas[1] > maior){
                maior = this.marcas[i];
            }
        }
        return maior;
    }
    //método toString definido na classe do objeto
    //classe Arrays, método toString e o nome do Array
    //Recebe o "this" pq ele é um objeto privado
    public String toString(){
        return this.nome + "\nMarcas" + Arrays.toString(this.marcas);
    }
    
}