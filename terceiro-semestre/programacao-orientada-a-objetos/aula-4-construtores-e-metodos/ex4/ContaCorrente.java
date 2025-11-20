package ex4;

public class ContaCorrente {
    private float saldo;

    public void definirSaldoInicial(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor > saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public float getSaldo() {
        return saldo;
    }
}
