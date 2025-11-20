package ex1;

public class FuncionarioPJ extends Funcionario{

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase();
    }
}
