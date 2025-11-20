package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*7 - Escreva um programa Java que use uma matriz para armazenar as notas
        de 3 alunos em 4 disciplinas e depois imprima na tela a nota mais alta e a
        nota mais baixa em cada disciplina.*/
        double[][] notas  = new double[3][4]; //usei a mesma estrutura do ex4 =)
        double[] maior = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        double[] menor = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<notas.length; i++){
            for(int j=0; j<notas[i].length; j++){
                System.out.println("Digite a nota da "+(j+1)+"ª disciplina do "+(i+1)+"º aluno: ");
                notas[i][j] = sc.nextDouble();
                if(notas[i][j] > maior[j]){
                    maior[j] = notas[i][j];
                }
                if(notas[i][j] < menor[j]){
                    menor[j] = notas[i][j];
                }
            }
        }
        for(int i=0; i<notas[0].length; i++){
            System.out.println("Maior nota da "+(i+1)+" disciplina: "+maior[i]);
            System.out.println("Menor nota da "+(i+1)+" disciplina: "+menor[i]);
            System.out.println("---------------");
        }
    }
}
