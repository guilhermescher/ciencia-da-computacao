package ex1;

public class FuncionarioCLT extends Funcionario{

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + 500;
    }
}
