package ex4;

class Cheque {
    private double valor;

    public Cheque(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}

class ContaBancaria {
    private double saldo = 0;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void depositar(Cheque cheque) {
        saldo += cheque.getValor();
    }

    public double getSaldo() {
        return saldo;
    }
}