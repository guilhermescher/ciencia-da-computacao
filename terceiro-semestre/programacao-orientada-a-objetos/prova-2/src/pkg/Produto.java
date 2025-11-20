package pkg;

public class Produto {
    private String nome;
    private double preco;
    private double desconto;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void calcularPrecoFinal(){
        System.out.println("Preço final: " + getPreco());
    }
    public void aplicarDesconto(double desconto){
        setDesconto(desconto);
        setPreco(getPreco() * getDesconto());
    }

    @Override
    public String toString() {
        return "nome = " + nome  + ", preco = " + preco;
    }
}
