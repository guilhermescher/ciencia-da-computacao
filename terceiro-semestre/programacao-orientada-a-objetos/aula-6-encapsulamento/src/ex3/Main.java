package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Digite o tamanho da base do retângulo: ");
        retangulo.setBase(sc.nextDouble());
        System.out.println("Digite a altura do retângulo: ");
        retangulo.setAltura(sc.nextDouble());
        System.out.println("Área do retângulo: " + retangulo.calculaArea());
        sc.close();
    }
}
