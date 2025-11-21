/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Pessoa;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class PessoaDAO {
    private Conexao conexao;
    private Connection conn;
    
    public PessoaDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Pessoa pessoa){
        String sql = "INSERT INTO pessoa (nome, sexo, idioma) VALUES (?,?,?);";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            stmt.execute();
        }
        catch(SQLException e){
            System.out.println("Erro ao inserir aluno: " + e.getMessage());
        }
    }
    
    public Pessoa getPessoa(int id){
        String sql = "select * from pessoa where id = ?";
        try{
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Pessoa p = new Pessoa();
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setSexo(rs.getString("sexo"));
            p.setIdioma(rs.getString("idioma"));
            return p;
        }
        catch(SQLException e){
            System.out.println("Erro ao realizar a consulta: " + e.getMessage());
            return null;
        }
    }
    
    public void editar(Pessoa pessoa){
        try{
            String sql = "update pessoa set nome=?, sexo=?, idioma=? where id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            stmt.setInt(4, pessoa.getId());
            stmt.execute();
        }
        catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public void excluir(int id){
        try{
            String sql = "delete from pessoa where id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        }
        catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public List<Pessoa> getPessoas() {
        String sql = "SELECT * FROM PESSOA";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery();
            List<Pessoa> listaPessoas = new ArrayList();
            while (rs.next()){
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setSexo(rs.getString("sexo"));
                p.setIdioma(rs.getString("idioma"));
                listaPessoas.add(p);
            }
            return listaPessoas;
        }
        catch (SQLException e){
            System.out.println("Erro ao consultar todas as pessoas: " + e.getMessage());
            return null;
        }
    }
    
    public List<Pessoa> getPessoasNome (String nome, String sexo){
        String sql = "SELECT * FROM pessoa WHERE nome LIKE ? and sexo like ?";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, "%" + nome + "%");
            stmt.setString(2, "%" + sexo + "%");
            ResultSet rs = stmt.executeQuery();
            List<Pessoa> listaPessoas = new ArrayList();
            
            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setSexo(rs.getString("sexo"));
                p.setIdioma(rs.getString("idioma"));
                listaPessoas.add(p);
            }
            return listaPessoas;
        }
        catch (SQLException e) {
            System.out.println("Erro ao consultar todas as pessoa: " + e.getMessage());
            return null;
        }
    }
}
