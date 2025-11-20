package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*1 - Faça um programa para leitura de dois números e após faça as quatro operações
        matemáticas (Soma, Subtração, Multiplicação e divisão)*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro número: ");
        double x = sc.nextDouble();
        System.out.println("Digite o valor do segundo número: ");
        double y = sc.nextDouble();
        sc.close();

        double resultado = x + y;
        System.out.println("Soma: " + resultado);
        resultado = x - y;
        System.out.println("Subtração: " + resultado);
        resultado = x * y;
        System.out.println("Multiplicação: " + resultado);
        resultado = x / y;
        System.out.println("Divisão: " + resultado);
    }
}