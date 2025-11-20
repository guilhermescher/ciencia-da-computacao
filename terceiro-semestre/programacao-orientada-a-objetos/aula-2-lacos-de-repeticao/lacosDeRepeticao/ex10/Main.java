package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //10 - Escreva um programa Java que use um para calcular a média de vários números reais lidos do usuário até que seja lido o número 0.
        int i = 0, contador = 0;
        double soma = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite um numero para calcular a media (0 para sair): ");
            i = sc.nextInt();
            if(i == 0){
                break;
            }
            soma += i;
            contador++;
        }while (true);
        soma = soma / contador;
        System.out.println(soma);
    }
}
