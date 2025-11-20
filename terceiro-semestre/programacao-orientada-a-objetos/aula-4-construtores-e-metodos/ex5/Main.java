package ex5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual construtor deseja utilizar? (1 - Nome e Idade, 2 - Apenas Idade): ");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.print("Informe o nome: ");
            String nome = scanner.next();
            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();
            Pessoa pessoa = new Pessoa(nome, idade);
        } else if (escolha == 2) {
            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();
            Pessoa pessoa = new Pessoa(idade);
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
