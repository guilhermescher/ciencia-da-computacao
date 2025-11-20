package ex2;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String trabalhar(){
        return "A pessoa está trabalhando.";
    }
}
