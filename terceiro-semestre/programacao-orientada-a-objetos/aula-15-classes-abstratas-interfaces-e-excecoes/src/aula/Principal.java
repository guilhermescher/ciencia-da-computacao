package aula;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws MinhaExcecao {
        ContaCorrente conta = new ContaCorrente(1000, 500);
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Digite o valor para depósito:");
        valor = sc.nextDouble();
        conta.depositar(valor);
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Digite o valor para saque:");
        valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
