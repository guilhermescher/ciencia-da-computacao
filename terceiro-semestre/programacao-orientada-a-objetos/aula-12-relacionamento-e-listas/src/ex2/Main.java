package ex2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Pringles", 10.0);
        Produto produto2 = criarProdutoDesconto("Doritos", 10.0);

        System.out.println("Produto 1:");
        System.out.print("Nome: " + produto1.getNome());
        System.out.println(", Preço: " + produto1.getPreco());
        System.out.println("---------");
        System.out.println("Produto 2:");
        System.out.print("Nome: " + produto2.getNome());
        System.out.print(", Preço: " + produto2.getPreco());
    }
    public static Produto criarProdutoDesconto(String nome, double preco){
        return new Produto(nome, preco * 0.9);
    }
}
