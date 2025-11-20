package ex4;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Guilherme", 1000.0);
        System.out.print("Titular: " + conta.getTitular());
        System.out.println(", Saldo: " + conta.getSaldo());
        depositar(conta, 500.0);
        System.out.print("Saldo após depósito: " + conta.getSaldo());
    }
    public static void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
    }
}
