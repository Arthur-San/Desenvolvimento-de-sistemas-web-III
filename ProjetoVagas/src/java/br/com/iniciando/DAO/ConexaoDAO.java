package br.com.iniciando.DAO;

import conexao.Conexao;
import br.com.iniciando.dominio.Cadastrar;
import br.com.iniciando.dominio.CadastrarVaga;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoDAO {

    public void adiciona(Cadastrar cadastrar) throws SQLException {
        Conexao conn = new Conexao();
        String sql = "insert cadastrar(emailc, senha, endereco, enderecop, cidadec, estadoc, cep) values(?,?,?,?,?,?)";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        
        ps.setString(1, cadastrar.getEmailc());
        ps.setInt(2, cadastrar.getSenha());
        ps.setString(3, cadastrar.getEndereco());
        ps.setString(4, cadastrar.getEnderecop());
        ps.setString(5, cadastrar.getCidadec());
        ps.setString(6, cadastrar.getEstadoc());
        ps.setString(7, cadastrar.getCep());
        
    }
    
    public void adcionav(CadastrarVaga cadastrarvaga) throws SQLException {
        Conexao conn = new Conexao();
        String sql = "insert cadastrarvaga(nomearea, sal, requisitos, cidade, estado) values(?,?,?,?)";
        PreparedStatement ps = conn.getConexao().prepareStatement(sql);
        
        ps.setString(1, cadastrarvaga.getNomeare());
        ps.setInt(2, cadastrarvaga.getSalario());
        ps.setString(3, cadastrarvaga.getCidade());
        ps.setString(4, cadastrarvaga.getEstado());
    }
}
