package ex6;

public class Aluno {
    private String nome;
    private String matricula;
    private String dataNascimento;
    private int anoIngresso;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula);
    }

    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;
        System.out.println("Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Ano de Ingresso: " + anoIngresso);
    }
}