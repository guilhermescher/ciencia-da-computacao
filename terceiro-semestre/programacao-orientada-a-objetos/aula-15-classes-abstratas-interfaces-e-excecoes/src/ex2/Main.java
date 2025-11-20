package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do 1 lado do triângulo: ");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o valor do 2 lado do triângulo: ");
        double lado2 = sc.nextDouble();
        System.out.println("Digite o valor do 3 lado do triângulo: ");
        double lado3 = sc.nextDouble();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        try {
            triangulo.validarTriangulo();
            System.out.println("Os lados formam um triângulo válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
