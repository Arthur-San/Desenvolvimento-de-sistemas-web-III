/*
 * Classe de conexão.
 */
package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

public class Conexao {
    //propriedade de conexão
    private Connection conn;
    
    private void conectar() {
        System.out.println("Conectando ao Banco de Dados");
        
        //comando try, vai tentar a conexão
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/vagas", "root", "");
            System.out.println("Conectado");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada, adicione os arquivos da biblioteca");
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            System.out.println("e");
        }
    }
    
    public Connection getConexao() {
        conectar();
        return conn;
    }
    
}