package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();
        Funcionario funcionario = new Funcionario(nome);
        System.out.print(funcionario.trabalhar());
    }
}
