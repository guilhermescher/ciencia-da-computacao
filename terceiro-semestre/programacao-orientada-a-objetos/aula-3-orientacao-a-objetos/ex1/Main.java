package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a marca do primeiro carro: ");
        carro1.marca = sc.nextLine();
        System.out.print("Digite o modelo do primeiro carro: ");
        carro1.modelo = sc.nextLine();
        System.out.print("Digite o ano do primeiro carro: ");
        carro1.anoFabricacao = sc.nextInt();
        sc.nextLine(); //para limpar o buffer
        System.out.print("\nDigite a marca do segundo carro: ");
        carro2.marca = sc.nextLine();
        System.out.print("Digite o modelo do segundo carro: ");
        carro2.modelo = sc.nextLine();
        System.out.print("Digite o ano do segundo carro: ");
        carro2.anoFabricacao = sc.nextInt();
        sc.close();

        System.out.println("\nMarca do primeiro carro: " + carro1.marca);
        System.out.println("Modelo do primeiro carro: " + carro1.modelo);
        System.out.println("Ano de fabricação do primeiro carro: " + carro1.anoFabricacao);
        System.out.println("\nMarca do segundo carro: " + carro2.marca);
        System.out.println("Modelo do segundo carro: " + carro2.modelo);
        System.out.println("Ano de fabricação do primeiro carro: " + carro2.anoFabricacao);

    }
}
