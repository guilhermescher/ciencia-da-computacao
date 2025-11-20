package ex2;

public class Livro {
    String titulo, autor, genero;
    int anoPublicacao;
    boolean emprestado;

    public Livro(String titulo, String autor, String genero, int anoPublicacao, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = emprestado;
    }

    public Livro(){

    }

    public void Emprestimo(){
        if(emprestado){
            System.out.println("Já foi emprestado.");
        }
        else{
            System.out.println("Emprestado com sucesso.");
            this.emprestado = true;
        }
    }

    public void Devolucao(){
        if(!emprestado){
            System.out.println("O livro já foi devolvido.");
        }
        else{
            System.out.println("Devolvido com sucesso.");
            this.emprestado = false;
        }
    }

    public String toString(){
        return "Título: " + this.titulo + "\nAutor: " + this.autor + "\nGenero: " + this.genero + "\nAno de publicacao: " + this.anoPublicacao + "\nEmprestado? " + this.emprestado;
    }
}
