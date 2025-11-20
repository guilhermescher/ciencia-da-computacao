package ex1;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) throws ExcecaoIdade {
        if(idade < 0 || idade > 120) {
            throw new ExcecaoIdade("Idade inválida.");
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
