package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*4 - Escrever um algoritmo para ler quatro valores inteiros, calcular a sua
        média, e escrever na tela os que são superiores à média.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int primeiro = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int segundo = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int terceiro = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        int quarto = sc.nextInt();
        sc.close();

        double media = (primeiro + segundo + terceiro + quarto) / 4.0;
        System.out.println("Média: " + media);

        if(primeiro > media){
            System.out.println("O primeiro valor é superior a média. ("+primeiro+" > "+media+")");
        }if(segundo > media){
            System.out.println("O segundo valor é superior a média. ("+segundo+" > "+media+")");
        }if(terceiro > media){
            System.out.println("O terceiro valor é superior a média. ("+terceiro+" > "+media+")");
        }if(quarto > media){
            System.out.println("O quarto valor é superior a média. ("+quarto+" > "+media+")");
        }if (primeiro < media && segundo < media && terceiro < media && quarto < media) {
            System.out.println("Nenhum valor é superior a média");
        }
    }
}
