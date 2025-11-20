package ex1;

public class ContaBancaria {
    private double saldo;
    private double limite;

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

    public void sacar(double valor) {
        if(valor < limite) {
            if(valor < saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso.");
            }
            else {
                System.out.println("Saldo insuficiente.");
            }
        }
        else {
            System.out.println("Limite insuficiente.");
        }
    }
}