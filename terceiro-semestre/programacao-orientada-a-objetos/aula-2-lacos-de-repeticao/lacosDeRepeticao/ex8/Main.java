package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido.*/
        String cidade;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Digite uma cidade (São Paulo para sair): ");
            cidade = sc.nextLine();
            if(cidade.equals("São Paulo")){
                break;
            }
        }
    }
}
