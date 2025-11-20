package ex6;

public class Gerente extends Funcionario {
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    public void aumentarSalario(double percentual, double adicionalBonus) {
        salario += salario * (percentual / 100);
        salario += adicionalBonus;
    }

    @Override
    public String toString() {
        return "Gerente: " + nome + ", Salário: " + salario + ", Bônus Anual: " + bonusAnual;
    }
}
