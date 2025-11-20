package ex10;

public class Tarefa {
    String descricao;
    boolean concluida = false;

    void concluirTarefa() {
        concluida = true;
    }

    void exibirTarefa() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Concluída: " + (concluida ? "Sim" : "Não"));
    }
}
