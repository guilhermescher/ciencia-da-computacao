package ex13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void Dog(List<Conta> contas) {
        int numero = 0;
        String titular = "";
        double saldo = 0;
        for(Conta c : contas){
            System.out.println("Número da conta : " + c.getNumero() + ", Titular: " + c.getTitular() + ", Saldo: " + c.getSaldo());
            if(c.getSaldo() > saldo){
                numero = c.getNumero();
                titular = c.getTitular();
                saldo = c.getSaldo();
            }
        }
        System.out.println("Conta com maior saldo: " + "Número : " + numero + ", titular: " + titular + ", saldo: " + saldo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas contas você deseja adicionar: ");
        List<Conta> contas = new ArrayList<Conta>();
        int contador = sc.nextInt();
        for (int i = 0; i < contador; i++) {
            System.out.println("Digite o número da conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o titular da conta: ");
            String titular = sc.nextLine();
            System.out.println("Digite o saldo da conta: ");
            double saldo = sc.nextDouble();
            contas.add(new Conta(numero, titular, saldo));
        }
        Dog(contas);
    }
}
