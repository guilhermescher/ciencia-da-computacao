package ex2;

public class Main {
    public static void main(String[] args) {
        //2 - Escreva um programa Java que use uma matriz para ler os valores de uma tabela de multiplicação (tabuada) de 10x10 e depois a imprima na tela.
        int[][] tabuada = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuada[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Tabuada do "+(i+1)+": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(tabuada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
