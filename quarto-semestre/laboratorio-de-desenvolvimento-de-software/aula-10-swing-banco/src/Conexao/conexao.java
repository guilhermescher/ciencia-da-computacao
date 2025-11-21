package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    public Connection getConexao(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/produtos?useTimezone=true$serverTimezone=UTC","root","laboratorio");
            System.out.println("Conexão realizada.");
            return conn;
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex.getMessage());
            return null;
        }   
    }
}
