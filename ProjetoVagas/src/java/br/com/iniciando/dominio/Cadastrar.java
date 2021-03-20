package br.com.iniciando.dominio;


public class Cadastrar {
  private String emailc;
  private int senha;
  private String endereco;
  private String enderecop;
  private String cidadec;
  private String estadoc;
  private String cep;

    public String getEmailc() {
        return emailc;
    }

    public void setEmailc(String emailc) {
        this.emailc = emailc;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecop() {
        return enderecop;
    }

    public void setEnderecop(String enderecop) {
        this.enderecop = enderecop;
    }

    public String getCidadec() {
        return cidadec;
    }

    public void setCidadec(String cidadec) {
        this.cidadec = cidadec;
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
  
}
