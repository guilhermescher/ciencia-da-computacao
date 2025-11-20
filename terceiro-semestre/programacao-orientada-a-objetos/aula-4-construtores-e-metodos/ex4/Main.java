package ex4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo inicial: " + novaConta.getSaldo());

        if (novaConta.sacar(500)) {
            System.out.println("Saque de 500 pila realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de 500 pila.");
        }

        novaConta.depositar(50);
        System.out.println("Saldo após depósito de 50 pila: " + novaConta.getSaldo());

        if (novaConta.sacar(600)) {
            System.out.println("Saque de 600 pila realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de 600 pila.");
        }

        System.out.println("Saldo final: " + novaConta.getSaldo());
    }
}
