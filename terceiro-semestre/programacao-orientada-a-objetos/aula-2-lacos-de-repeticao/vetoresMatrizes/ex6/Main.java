package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //6 - Escreva um programa Java que use um vetor para ler os nomes de 5 cidades e outro vetor para armazenar as suas respectivas populações e depois imprima na tela o nome da cidade mais populosa.
        int[] populacao = new int[5];
        String[] cidade = new String[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome da cidade: ");
            cidade[i] = sc.nextLine();
            System.out.println("Digite o numero de habitantes: ");
            populacao[i] = sc.nextInt();
            sc.nextLine();//pra nao dar erro entre o nextline e nextint
        }
        sc.close();

        int armazenador = 0, maior = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            if(populacao[i] > maior){
                maior = populacao[i];
                armazenador = i;
            }
        }

        System.out.println("A cidade mais populosa e "+cidade[armazenador]+" com "+populacao[armazenador]+ " habitantes.");
    }
}
