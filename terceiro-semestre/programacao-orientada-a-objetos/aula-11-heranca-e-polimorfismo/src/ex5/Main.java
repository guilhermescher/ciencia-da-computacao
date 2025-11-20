package ex5;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Cliente cliente = new Cliente(0.15); // 15% de desconto

        double precoBase = 200.0;
        double precoSemDesconto = produto.calcularPrecoFinal(precoBase);
        double precoComDesconto = produto.calcularPrecoFinal(precoBase, cliente);

        System.out.println("Preço sem desconto: " + precoSemDesconto);
        System.out.println("Preço com desconto: " + precoComDesconto);
    }
}
