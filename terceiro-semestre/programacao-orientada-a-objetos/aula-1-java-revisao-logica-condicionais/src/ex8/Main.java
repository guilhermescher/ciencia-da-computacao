package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*8 - Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valorUm = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valorDois = sc.nextInt();
        sc.close();

        if(valorUm > valorDois){
            if((valorUm % valorDois) == 0){
                System.out.println(valorUm+" é múltiplo de "+valorDois);
            }
            else{
                System.out.println("Os valores não são múltiplos um do outro.");
            }
        }
        else if(valorDois > valorUm){
            if((valorDois % valorUm) == 0){
                System.out.println(valorDois+" é múltiplo de "+valorUm);
            }
            else{
                System.out.println("Os valores não são múltiplos um do outro.");
            }
        }
        else{
            System.out.println("Os valores são iguais.");
        }
    }
}
