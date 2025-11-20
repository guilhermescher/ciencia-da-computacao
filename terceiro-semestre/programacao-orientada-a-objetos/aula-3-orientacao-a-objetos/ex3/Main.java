package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.print("Digite o nome da pessoa: ");
        p.nome = sc.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        p.idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o gênero da pessoa: ");
        p.genero = sc.nextLine();
        sc.close();

        System.out.println("\nNome da pessoa: " + p.nome);
        System.out.println("Idade da pessoa: " + p.idade);
        System.out.println("Gênero da pessoa: " + p.genero);
    }
}
