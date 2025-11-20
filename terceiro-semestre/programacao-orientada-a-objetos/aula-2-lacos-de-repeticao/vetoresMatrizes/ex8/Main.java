package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*8 - Escreva um programa Java que use um vetor para armazenar 10
        números inteiros lidos do usuário e depois imprima na tela quantos números
        são pares e quantos são ímpares.*/
        int[] vetor = new int[10];
        int contadorPar = 0, contadorImpar = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o "+(i+1)+" valor: ");
            vetor[i] = sc.nextInt();
            if(vetor[i] % 2 == 0){
                contadorPar++;
            }
            else{
                contadorImpar++;
            }
        }

        System.out.println("Quantidade de números pares: "+contadorPar);
        System.out.println("Quantidade de números ímpares: "+contadorImpar);
    }
}