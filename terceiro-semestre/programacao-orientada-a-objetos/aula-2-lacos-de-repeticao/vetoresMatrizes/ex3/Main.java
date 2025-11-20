package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3 - Escreva um programa Java que use um vetor para ler as notas de 5 alunos e depois calcule e imprima a média das notas.
        double[] notas = new double[5];
        double media = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Digite a "+(i+1)+"º nota: ");
            notas[i] = sc.nextInt();
            media += notas[i];
        }
        media = media / 5;
        System.out.println("Media: " + media);
    }
}
