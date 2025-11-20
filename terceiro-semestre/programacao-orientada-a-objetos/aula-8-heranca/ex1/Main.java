package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        System.out.print("Digite a cor do retângulo: ");
        String cor = sc.next();
        System.out.print("Digite se ele está preenchido: ");
        String preenchido = sc.next();
        Retangulo retangulo = new Retangulo(cor, preenchido, largura, altura);
        System.out.print(retangulo.calcularArea());
    }
}
