package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computador pc1 = new Computador();
        Computador pc2 = new Computador();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a marca do 1 computador: ");
        pc1.marca = sc.nextLine();
        System.out.print("Digite o modelo do 1 computador: ");
        pc1.modelo = sc.nextLine();
        System.out.print("Digite o tipo do 1 computador: ");
        pc1.tipo = sc.nextLine();
        System.out.print("Digite o preço do 1 computador: ");
        pc1.preco = sc.nextFloat();
        sc.close();

        pc2.marca = "Dell";
        pc2.modelo = "OptiFlex 3060";
        pc2.tipo = "Computador";
        pc2.preco = 1234.5678;

        System.out.println("\nMarca do 1 computador: " + pc1.marca);
        System.out.println("Modelo do 1 computador: " + pc1.modelo);
        System.out.println("Tipo do 1 computador: " + pc1.tipo);
        System.out.println("Preço do 1 computador: " + pc1.preco);
        System.out.println("\nMarca do 2 computador: " + pc2.marca);
        System.out.println("Modelo do 2 computador: " + pc2.modelo);
        System.out.println("Tipo do 2 computador: " + pc2.tipo);
        System.out.println("Preço do 2 computador: " + pc2.preco);
    }
}
