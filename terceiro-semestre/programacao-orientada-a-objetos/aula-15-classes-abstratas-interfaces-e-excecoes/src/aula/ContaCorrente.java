package aula;

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    public void depositar(double valor) throws MinhaExcecao {
        if (valor <= 0) {
            throw new MinhaExcecao("Valor de depósito deve ser positivo.");
        }
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) throws MinhaExcecao {
        if (valor <= 0) {
            throw new MinhaExcecao("Valor de saque deve ser positivo.");
        }
        if (valor > getSaldo() || valor > getLimite()) {
            throw new MinhaExcecao("Saldo insuficiente para saque.");
        }
        System.out.println("Saque de " + valor + " realizado com sucesso.");
        setSaldo(getSaldo() - valor);
    }
}
