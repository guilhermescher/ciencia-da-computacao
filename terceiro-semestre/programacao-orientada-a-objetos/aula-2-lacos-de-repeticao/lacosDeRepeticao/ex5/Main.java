package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*5 - Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro.*/
        int numero, resultado = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que você deseja calcular o fatorial: ");
        numero = sc.nextInt();
        sc.close();
        for(int i = 1; i <= numero; i++){
            resultado *= i;
        }
        System.out.println(resultado);
    }
}