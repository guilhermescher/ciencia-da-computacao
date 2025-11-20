package exercicio_9;

public class Main {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados();
        bd.conectar();
        bd.desconectar();
        bd.inserir();
        bd.atualizar();
        bd.excluir();
    }
}
