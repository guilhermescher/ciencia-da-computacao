package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 - Escreva um programa Java que use um vetor para ler 5 nomes de pessoas e depois os imprima na tela.
        String[] nomes = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite o "+(i+1)+"º nome: ");
            nomes[i] = sc.nextLine();
        }
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
