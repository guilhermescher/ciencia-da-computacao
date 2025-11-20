package ex5;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Idade: " + idade);
    }
}