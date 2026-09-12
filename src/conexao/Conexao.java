package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
    private Connection conexao = null;
    
public Connection conectaBanco() {
    try {
        Class.forName("org.mariadb.jdbc.Driver");

        conexao = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/aula02",
            "java_app",
            ""
        );

        JOptionPane.showMessageDialog(
            null,
            "Conexão realizada com sucesso!"
        );

    } catch (ClassNotFoundException drive) {

        JOptionPane.showMessageDialog(
            null,
            "Driver não encontrado: " + drive.getMessage(),
            "Erro Driver",
            JOptionPane.ERROR_MESSAGE
        );

    } catch (SQLException fonte) {

        JOptionPane.showMessageDialog(
            null,
            "Erro SQL: " + fonte.getMessage(),
            "Erro de conexão",
            JOptionPane.ERROR_MESSAGE
        );
    }

    return conexao;
}
    
}
