/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor;

import beans.Produto;
import dao.ProdutoDAO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author thiag
 */
public class ThreadServer extends Thread{
    private Socket produtoSocket;

    public ThreadServer(Socket produtoSocket) {
        this.produtoSocket = produtoSocket;
    }
    @Override
    public void run(){
        try{
            ObjectOutputStream out = new ObjectOutputStream(produtoSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(produtoSocket.getInputStream());
            int id = in.readInt();
            
            ProdutoDAO pDAO = new ProdutoDAO();
            Produto p = pDAO.getProduto(id);
            out.writeObject(p);
            
        }catch (IOException ex) {
            System.out.println("Erro" + ex.getMessage());
        }
    }
}
