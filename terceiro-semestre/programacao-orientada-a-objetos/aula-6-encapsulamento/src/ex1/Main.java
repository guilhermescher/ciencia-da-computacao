package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        System.out.print("Digite o saldo da sua conta bancária: ");
        conta.setSaldo(sc.nextDouble());
        System.out.print("Digite o limite da sua conta bancária: ");
        conta.setLimite(sc.nextDouble());
        System.out.println("Digite quanto você deseja sacar: ");
        double valor = sc.nextDouble();
        conta.sacar(valor);
        System.out.println("Saldo final: " + conta.getSaldo());
        sc.close();
    }
}
