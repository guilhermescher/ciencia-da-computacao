package ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<Livro>();
        livros.add(new Livro("Diário de um banana", "Greg"));
        livros.add(new Livro("1984", "Scher"));
        livros.add(new Livro("O hobbit", "Weber"));

        imprimir(livros);
    }
    public static void imprimir(List<Livro> livros) {
        for (Livro livro : livros) {
            System.out.print("Título: " + livro.getTitulo());
            System.out.println(", Autor: " + livro.getAutor());
        }
    }
}
