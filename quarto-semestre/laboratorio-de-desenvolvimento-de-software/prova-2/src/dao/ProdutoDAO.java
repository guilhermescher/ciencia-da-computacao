package dao;

import beans.Produto;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class ProdutoDAO {
    
    private Conexao conexao;
    private Connection conn;

    public ProdutoDAO(){
        this.conexao =  new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Produto p){
        try {
            String sql = "INSERT INTO produto(nome, preco, saldo) VALUES (?, ?, ?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, p.getNome());
            stmt.setFloat(2, p.getPreco());
            stmt.setFloat(3, p.getSaldo());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    public void editar(Produto p){
        try {
            String sql = "UPDATE produto SET nome=?, preco=?, saldo=? WHERE id=?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setFloat(2, p.getPreco());
            stmt.setFloat(3, p.getSaldo());
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
    public void excluir(int id) {
        try {
            String sql = "delete from produto WHERE id=?";

            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);   
            stmt.execute();
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }
    
    // retorna todos
     public List<Produto> getProdutos(){
        try {
            String sql = "SELECT * FROM produto";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Produto>listaProdutos = new ArrayList();
            while (rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
                p.setSaldo(rs.getFloat("saldo"));
                listaProdutos.add(p);
            }
            return listaProdutos;
            
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex.getMessage());
            return null;
        }
    }
    
    //busca por id
    public Produto getProduto(int id){
        try {
            String sql = "SELECT * FROM produto WHERE id =?";
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Produto p = new Produto();
            rs.first();
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setPreco(rs.getFloat("preco"));
            p.setSaldo(rs.getFloat("saldo"));
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex.getMessage());
            return null;
        }
    }
    
    //busca por nome
    public List<Produto> getProduto(String nome){
        try {
            String sql = "SELECT * FROM produto WHERE nome LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%"+ nome +"%");
            ResultSet rs = stmt.executeQuery();
            List <Produto> listaProdutos = new ArrayList();
            while(rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getFloat("preco"));
                p.setSaldo(rs.getFloat("saldo"));
                listaProdutos.add(p);
            }
            return listaProdutos;
            
                  
        } catch (SQLException ex) {
            System.out.println("Erro: "+ex.getMessage());
            return null;        }
    }
}
