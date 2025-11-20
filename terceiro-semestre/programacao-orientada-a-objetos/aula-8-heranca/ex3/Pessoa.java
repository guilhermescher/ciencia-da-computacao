package ex3;

public class Pessoa extends SerHumano {
    public Pessoa(String tipo, String nome, int idade) {
        super(tipo, nome, idade);
    }

    public String toString() {
        return "Tipo: " + tipo + ", Nome: " + nome + ", Idade: " + idade;
    }
}
