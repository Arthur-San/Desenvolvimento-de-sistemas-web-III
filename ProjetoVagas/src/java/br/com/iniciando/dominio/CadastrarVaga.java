package br.com.iniciando.dominio;


public class CadastrarVaga {
    private String nomearea;
    private int salario;
    private String cidade;
    private String estado;

    public String getNomeare() {
        return nomearea;
    }

    public void setNomeare(String nomeare) {
        this.nomearea = nomeare;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
