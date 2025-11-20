package ex1;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 8.5);
        Aluno aluno2 = new Aluno("Maria", 5.0);
        Boletim boletim = new Boletim();

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota Final: " + aluno.getNotaFinal());
        boletim.imprimirStatus(aluno);

        System.out.println("---------");

        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota Final: " + aluno2.getNotaFinal());
        boletim.imprimirStatus(aluno2);
    }
}
