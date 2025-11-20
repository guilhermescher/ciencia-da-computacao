package exercicio_7;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularSalario(double valor) {
        setSalario(getSalario() + valor);
        System.out.println("Salario atualizado: " + getSalario());
    }
}
