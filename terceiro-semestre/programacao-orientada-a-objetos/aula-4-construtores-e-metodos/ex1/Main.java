package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeDisci, nomeProf;
        int cargaHoraria;
        Disciplina d = new Disciplina();
        d.Adicionar("poo", "ricardo", 80);
        System.out.println("Deseja adicionar novos valores? (S/N)");
        Scanner sc = new Scanner(System.in);
        char opcao = sc.next().charAt(0);
        sc.nextLine();
        if (opcao == 'S' || opcao == 's') {
            System.out.println("Digite o nome da disciplina: ");
            nomeDisci = sc.nextLine();
            System.out.println("Digite o nome do professor: ");
            nomeProf = sc.nextLine();
            System.out.println("Digite a carga horária: ");
            cargaHoraria = sc.nextInt();
            d.Adicionar(nomeDisci, nomeProf, cargaHoraria);
            System.out.println("nome da disciplina: " + d.nomeDisci);
            System.out.println("nome do professor: " + d.nomeProf);
            System.out.println("carga horaria: " + d.cargaHoraria);
        }
        else{
            System.out.println("nome da disciplina: " + d.nomeDisci);
            System.out.println("nome do professor: " + d.nomeProf);
            System.out.println("carga horaria: " + d.cargaHoraria);
        }
    }
}
