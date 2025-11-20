package ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme f = new Filme();

        System.out.print("Título: ");
        f.titulo = sc.nextLine();
        System.out.print("Diretor: ");
        f.diretor = sc.nextLine();
        System.out.print("Duração (min): ");
        f.duracaoEmMinutos = sc.nextInt();
        sc.nextLine(); // limpeza
        System.out.print("Gênero: ");
        f.genero = sc.nextLine();

        f.exibirDetalhes();
        System.out.println("É longo? " + (f.ehLongo() ? "Sim" : "Não"));
    }
}
