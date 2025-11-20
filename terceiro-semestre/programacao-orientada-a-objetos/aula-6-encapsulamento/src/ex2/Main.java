package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();
        System.out.println("Digite o raio do círculo: ");
        circulo.setRaio(sc.nextDouble());
        System.out.println("Área do círculo: " + circulo.calculaArea());
        sc.close();
    }
}
