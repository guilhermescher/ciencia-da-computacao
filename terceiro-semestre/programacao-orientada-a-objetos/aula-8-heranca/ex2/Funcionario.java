package ex2;

public class Funcionario extends Pessoa{
    public Funcionario(String nome) {
        super(nome);
    }

    public String trabalhar(){
        return "O funcionário está trabalhando.";
    }
}
