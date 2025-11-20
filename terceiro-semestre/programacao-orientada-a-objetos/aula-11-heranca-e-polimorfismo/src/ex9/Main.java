package ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("not", 3500.00, 5));
        produtos.add(new Produto("mouse", 80.00, 20));
        produtos.add(new Produto("teclado", 150.00, 10));
        produtos.add(new Produto("monitor", 900.00, 3));

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println();
        }
    }
}
