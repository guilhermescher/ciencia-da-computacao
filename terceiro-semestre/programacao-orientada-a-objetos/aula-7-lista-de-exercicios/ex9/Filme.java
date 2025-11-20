package ex9;

public class Filme {
    String titulo;
    String diretor;
    int duracaoEmMinutos;
    String genero;

    void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoEmMinutos + " min");
        System.out.println("Gênero: " + genero);
    }

    boolean ehLongo() {
        return duracaoEmMinutos > 120;
    }
}
