package pkg;

public class ProdutoAlimenticio extends Produto {
    public ProdutoAlimenticio(String nome, double preco) {
        super(nome, preco);
    }

    public void calcularPrecoFinal(double descontoValidade){
        System.out.println("Preço final com o desconto: " + (getPreco() * (1 - descontoValidade)));
        setPreco(getPreco() * descontoValidade);
    }
}
