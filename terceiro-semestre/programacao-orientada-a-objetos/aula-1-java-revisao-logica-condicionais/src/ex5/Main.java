package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Guilherme Scher

        /*5 - Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe em
        qual quadrante o ponto se encontra no plano cartesiano ou se o ponto está
        sobre um dos eixos.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.println("Digite o valor de y: ");
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("O ponto se encontra no primeiro quadrante.");
        }else if(x < 0 && y > 0) {
            System.out.println("O ponto se encontra no segundo quadrante.");
        }else if(x < 0 && y < 0) {
            System.out.println("O ponto se encontra no terceiro quadrante.");
        }else if(x > 0 && y < 0) {
            System.out.println("O ponto se encontra no quarto quadrante.");
        }else if(x > 0 && y == 0) {
            System.out.println("O ponto se encontra entre o primeiro e o quarto quadrante, sobre o eixo x.");
        }else if(x < 0 && y == 0) {
            System.out.println("O ponto se encontra entre o segundo e o terceiro quadrante, sobre o eixo x.");
        }else if(x == 0 && y > 0) {
            System.out.println("O ponto se encontra entre o primeiro e o segundo quadrante, sobre o eixo y.");
        }else if(x == 0 && y < 0) {
            System.out.println("O ponto se encontra entre o terceiro e o quarto quadrante, sobre o eixo y.");
        }else if(x == 0 && y == 0) {
            System.out.println("O ponto se encontra na origem. (sobre o eixo x e o eixo y)");
        }
    }
}
