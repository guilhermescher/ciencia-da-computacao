package exercicio_7;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularSalario(double valor) {
        setSalario(getSalario() + valor);
        System.out.println("Salario atualizado: " + getSalario());
    }
}
