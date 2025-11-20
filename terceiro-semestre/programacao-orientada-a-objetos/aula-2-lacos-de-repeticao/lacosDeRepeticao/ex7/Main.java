package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 7 - Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1.*/
        int nota;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Digite uma nota (-1 para sair): ");
            nota = sc.nextInt();
            if(nota == -1){
                break;
            }
        }
    }
}
