package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto();
        System.out.print("Nome: ");
        p1.nome = sc.nextLine();
        System.out.print("Preço: ");
        p1.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        p1.quantidade = sc.nextInt();

        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 2.5;
        p2.quantidade = 100;

        System.out.println("\nProduto 1:");
        p1.exibirInformacoes();
        System.out.println("Total: R$" + p1.calcularValorTotal());

        System.out.println("\nProduto 2:");
        p2.exibirInformacoes();
        System.out.println("Total: R$" + p2.calcularValorTotal());
    }
}
