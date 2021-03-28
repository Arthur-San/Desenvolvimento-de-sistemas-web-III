/*
Atributos:
nome (de tipo String)
endereco (de tipo String)
telefone (do tipo int)
codigo (de tipo int)

 */
package aula07orientacao;
//nome da classe

public class Agenda {
    //atributos da clase
    String nome;
    String endereco;
    int telefone;
    int codigo;

    //métodos da classe
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
