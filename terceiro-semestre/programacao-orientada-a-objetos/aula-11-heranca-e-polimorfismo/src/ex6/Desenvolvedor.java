package ex6;

public class Desenvolvedor extends Funcionario {
    private int horasExtras;

    public Desenvolvedor(String nome, double salario, int horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + ", Salário: " + salario + ", Horas Extras: " + horasExtras;
    }
}
