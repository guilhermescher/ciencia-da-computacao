package ex6;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + ", Salário: " + salario;
    }
}
