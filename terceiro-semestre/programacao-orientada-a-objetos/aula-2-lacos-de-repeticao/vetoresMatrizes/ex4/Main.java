package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4 - Escreva um programa Java que use uma matriz para ler as notas de 3 alunos em 4 disciplinas e depois calcule e imprima a média de cada disciplina.
        double[][] notas  = new double[3][4];
        double[] media = {0, 0, 0, 0};//inicializei zerado para não dar problema na hora das somas

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<notas.length; i++){
            for(int j=0; j<notas[i].length; j++){
                System.out.println("Digite a nota da "+(j+1)+"ª disciplina do "+(i+1)+"º aluno: ");
                notas[i][j] = sc.nextDouble();
                media[j] += notas[i][j];
            }
        }
        for(int j=0; j<notas[0].length; j++){
            media[j] = media[j] / 3;
            System.out.println("Média da "+(j+1)+" disciplina: "+media[j]);
        }
    }
}
