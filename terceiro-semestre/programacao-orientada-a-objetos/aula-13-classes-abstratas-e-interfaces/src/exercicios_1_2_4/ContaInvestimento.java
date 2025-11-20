package exercicios_1_2_4;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
            setSaldo(getSaldo() + valor);
            System.out.println("Saldo atualizado: " + getSaldo());
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getLimite()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo atualizado: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirDados(){
        System.out.println("Saldo: " + getSaldo() + ", Limite: " + getLimite());
    }
}