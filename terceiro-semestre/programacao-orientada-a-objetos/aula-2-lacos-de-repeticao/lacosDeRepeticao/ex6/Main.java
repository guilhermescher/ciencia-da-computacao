package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*6- Escreva um programa Java que use um laço para ler uma sequência de números inteiros do usuário até que o número 0 seja lido.*/
        int i = 1;
        Scanner sc = new Scanner(System.in);
        while(i != 0){
            System.out.println("Digite um número (0 para sair): ");
            i = sc.nextInt();
        }
        sc.close();
    }
}