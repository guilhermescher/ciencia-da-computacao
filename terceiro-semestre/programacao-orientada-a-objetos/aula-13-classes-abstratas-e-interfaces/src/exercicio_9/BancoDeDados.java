package exercicio_9;

public class BancoDeDados implements AcessoDados {

    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando ao banco de dados");
    }

    @Override
    public void inserir() {
        System.out.println("Inserindo o banco de dados");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando o banco de dados");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo o banco de dados");
    }
}
