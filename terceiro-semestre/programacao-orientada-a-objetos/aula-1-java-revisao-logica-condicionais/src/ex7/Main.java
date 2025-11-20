package ex7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*6 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual
        o maior deles.*/

        //Tem um pacote que deixa isso bem mais fácil, então vou usar ele para reduzir código e deixar mais fácil de entender :)

        Scanner sc = new Scanner(System.in);

        double[] valores = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            valores[i] = sc.nextDouble();
        }
        sc.close();
        Arrays.sort(valores); //Bota em ordem crescente
        System.out.println("Ordem crescente: "+ Arrays.toString(valores)); //Passa o array para a string
    }
}
