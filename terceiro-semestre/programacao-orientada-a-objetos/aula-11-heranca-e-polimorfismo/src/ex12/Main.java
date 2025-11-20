package ex12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<Livro>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos livros você quer adicionar: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do livro: ");
            String nome = sc.nextLine();
            System.out.println("Digite o ano do livro: ");
            int ano = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o autor do livro: ");
            String autor = sc.nextLine();
            livros.add(new Livro(nome, autor, ano));
        }
        livros.sort(Comparator.comparingInt(Livro::getAno));
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
