package ex10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("gui", 7.5, 6.0));
        alunos.add(new Aluno("angela", 5.0, 4.5));
        alunos.add(new Aluno("weber", 8.0, 9.0));
        alunos.add(new Aluno("rose", 6.0, 5.5));

        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            if (media >= 6.0) {
                System.out.println(aluno.getNome() + " foi aprovado com média " + media);
            } else {
                System.out.println(aluno.getNome() + " foi reprovado com média " + media);
            }
        }
    }
}
