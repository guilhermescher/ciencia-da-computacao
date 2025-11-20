package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarefa[] tarefas = new Tarefa[3];

        for (int i = 0; i < 3; i++) {
            tarefas[i] = new Tarefa();
            System.out.print("Descrição da tarefa " + (i + 1) + ": ");
            tarefas[i].descricao = sc.nextLine();
        }

        tarefas[1].concluirTarefa(); // marca a segunda como concluída

        for (int i = 0; i < 3; i++) {
            System.out.println("\nTarefa " + (i + 1) + ":");
            tarefas[i].exibirTarefa();
        }
    }
}
