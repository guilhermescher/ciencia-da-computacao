package ex2;

import java.util.Scanner;

public class ProdutoComDesconto extends Produto {
    public void desconto(double valor){
        System.out.println("Produto com desconto: " + valor * 0.5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoComDesconto p = new ProdutoComDesconto();
        System.out.println("Digite o valor do produto: ");
        double valor = sc.nextDouble();
        p.desconto(valor);
        sc.close();
    }
}
