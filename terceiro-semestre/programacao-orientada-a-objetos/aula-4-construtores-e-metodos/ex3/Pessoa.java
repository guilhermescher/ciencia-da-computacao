package ex3;

public class Pessoa {
    private String nome;
    private String email;
    private String dataNascimento;
    private String endereco;
    private boolean isAdmin;

    public Pessoa(String nome, String email, String dataNascimento, String endereco) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.isAdmin = false;
    }

    public String getEmail() {
        return email;
    }

    public void promoverAdmin() {
        this.isAdmin = true;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Admin: " + (isAdmin ? "Sim" : "Não"));//se for true vai o sim
        System.out.println();
    }
}