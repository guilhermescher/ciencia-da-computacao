package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*10 - Altere o exercício 1 e faça um menu utilizando switch case*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro número: ");
        double x = sc.nextDouble();
        System.out.println("Digite o valor do segundo número: ");
        double y = sc.nextDouble();
        double resultado;
        sc.close();

        System.out.println("Menu de ações (digite a letra correspondente a operação que deseja realizar):\na - Somar\nb - Subtrair\nc - Multiplicar\nd - Dividir");
        char opcao = sc.next().charAt(0);
        switch(opcao){
            case 'a':
                resultado = x + y;
                System.out.println("Soma: " + resultado);
                break;
            case 'b':
                resultado = x - y;
                System.out.println("Subtração: " + resultado);
                break;
            case 'c':
                resultado = x * y;
                System.out.println("Multiplicação: " + resultado);
                break;
            case 'd':
                resultado = x / y;
                System.out.println("Divisão: " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}