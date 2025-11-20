package pkg;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public Produto(String nome) {
		this.nome = nome;
		this.quantidadeEstoque = 0;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = 0;
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

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome + ", Preço: " + preco + ", Quantidade no estoque: " + quantidadeEstoque);
	}
}
