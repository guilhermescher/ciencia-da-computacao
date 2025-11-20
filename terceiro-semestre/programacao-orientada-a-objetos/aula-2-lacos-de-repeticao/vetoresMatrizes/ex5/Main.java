package ex5;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //5 - Escreva um programa Java que use um vetor para ler 10 números inteiros lidos do usuário e depois imprima o maior e o menor valor.

        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o "+(i+1)+"º valor: ");
            vetor[i] = sc.nextInt();
        }
        sc.close();
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE; //pra ficar mais bonito e nao usar 0 e 99999
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("Menor valor: "+menor);
        System.out.println("Maior valor: "+maior);
    }
}