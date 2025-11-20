package ex3;

public class Agenda {
    private String nome;
    private String telefone;

    public void adicionarContato(String nome, String telefone) {
        try {
            if(nome == null || telefone == null) {
                throw new IllegalArgumentException("Nome e telefone não podem ser nulos.");
            }
            this.nome = nome;
            this.telefone = telefone;
            System.out.println("Contato adicionado: " + nome + " | " + telefone);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao adicionar contato: " + e.getMessage());
        }
    }
}