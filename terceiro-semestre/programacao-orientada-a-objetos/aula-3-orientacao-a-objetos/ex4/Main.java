package ex4;

import ex3.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro l = new Livro();
        System.out.print("Digite o título do livro: ");
        l.titulo = sc.nextLine();
        System.out.print("Digite o autor do livro: ");
        l.autor = sc.nextLine();
        System.out.print("Digite ano de publicação do livro: ");
        l.ano = sc.nextInt();
        sc.nextLine();
        sc.close();

        System.out.println("\nTítulo do livro: " + l.titulo);
        System.out.println("Autor do livro: " + l.autor);
        System.out.println("Ano de publicação do livro: " + l.ano);

    }
}
