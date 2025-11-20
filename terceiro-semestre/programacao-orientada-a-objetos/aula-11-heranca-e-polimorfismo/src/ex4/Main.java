package ex4;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.0);

        Cheque cheque = new Cheque(250.0);
        conta.depositar(cheque);

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}