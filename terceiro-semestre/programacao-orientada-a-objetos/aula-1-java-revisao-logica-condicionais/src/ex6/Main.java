package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*6 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual
        o maior deles.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double primeiro = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundo = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double terceiro = sc.nextDouble();

        if(primeiro > segundo && primeiro > terceiro) {
            System.out.println("O primeiro número é o maior valor.");
        }
        else if(segundo > primeiro && segundo > terceiro) {
            System.out.println("O segundo número é o maior valor.");
        }
        else if(terceiro > primeiro && terceiro > segundo) {
            System.out.println("O terceiro número é o maior valor.");
        }
        else if(primeiro == segundo && primeiro > terceiro){
            System.out.println("O primeiro e o segundo valor são iguais e maiores.");
        }
        else if(primeiro > segundo && primeiro == terceiro){
            System.out.println("O primeiro e o terceiro valor são iguais e maiores.");
        }
        else if(terceiro == segundo && terceiro > primeiro){
            System.out.println("O segundo e o terceiro valor são iguais e maiores.");
        }
        else if(primeiro == segundo && terceiro == segundo){
            System.out.println("Todos os valores são iguais.");
        }
    }
}
