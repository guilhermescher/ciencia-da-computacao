/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbaula01;

import beans.Pessoa;
import dao.PessoaDAO;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Guilherme");
        p.setSexo("M");
        p.setIdioma("Português");
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p);
    }
}
