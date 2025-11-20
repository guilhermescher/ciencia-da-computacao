package aula;

public abstract class Conta {
    private double saldo;
    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(){}
    public void sacar(){}
}
