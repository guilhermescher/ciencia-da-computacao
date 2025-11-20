package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os dados do primeiro dog:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Email: ");
        String email1 = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento1 = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco1 = scanner.nextLine();

        Pessoa pessoa1 = new Pessoa(nome1, email1, dataNascimento1, endereco1);
        pessoa1.promoverAdmin();

        System.out.println("\nInforme os dados dos segundo mano:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Email: ");
        String email2 = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String dataNascimento2 = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco2 = scanner.nextLine();

        Pessoa pessoa2 = new Pessoa(nome2, email2, dataNascimento2, endereco2);

        System.out.println("\nDetalhes do dogzao:");
        pessoa1.exibirDetalhes();
        System.out.println("Detalhes do mano:");
        pessoa2.exibirDetalhes();

        scanner.close();
    }
}
