package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import beans.Produto;

public class Servidor {
    public static void main(String[] args) {
        int porta = 1234;
        try (ServerSocket servidorSocket = new ServerSocket(porta)){
            System.out.println("Servidor aguardando conexão de porta");
            while(true){
                try{
                    Socket produtoSocket = servidorSocket.accept();
                    System.out.println("Conexão aceita de " + produtoSocket.getInetAddress());
                    
                    Thread threadProduto = new ThreadServer(produtoSocket);
                    threadProduto.start();

                }catch(IOException ex){
                    System.out.println("Erro ao aceitar conexão do cliente.");
                }
            }
        }catch(IOException e){
            System.out.println("Erro ao criar o servidorSocket.");
        }
    }
}
