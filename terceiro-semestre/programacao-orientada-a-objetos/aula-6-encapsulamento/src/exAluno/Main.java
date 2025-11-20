package exAluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o nome do aluno: ");
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);
        aluno.setNome(sc.nextLine());
        System.out.println("Digite a primeira nota: ");
        aluno.setNota1(sc.nextDouble());
        System.out.println("Digite a segunda nota: ");
        aluno.setNota2(sc.nextDouble());
        System.out.println(aluno.media());
    }
}
