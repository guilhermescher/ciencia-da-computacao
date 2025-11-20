package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*3 - Faça um algoritmo para ler um número e verificar se ele é par ou ímpar.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é par ou ímpar: ");

        double numero = sc.nextDouble();
        double resultado = numero % 2;

        if (resultado == 0) {
            System.out.println("O número digitado é par.");
        }
        else{
            System.out.println("O número digitado é ímpar.");
        }
    }
}
