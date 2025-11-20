package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 1;
		Scanner sc = new Scanner(System.in);
		Produto produto = null;
		while(opcao != 0) {
			System.out.println("----------\nMENU");
			System.out.println("1 - Criar produto informando nome");
			System.out.println("2 - Criar produto informando nome e preco");
			System.out.println("3 - Exibir informações do produto");
			System.out.println("4 - Atribuir nome do produto");
			System.out.println("5 - Obter nome do produto");
			System.out.println("6 - Atribuir preco do produto");
			System.out.println("7 - Obter preco do produto");
			System.out.println("8 - Atribuir quantidade em estoque");
			System.out.println("9 - Obter quantidade em estoque");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
				case 1:
					System.out.println("Informe o nome do produto: ");
					String nome = sc.nextLine();
					produto = new Produto(nome);
					break;
				case 2:
					System.out.println("Informe o nome do produto: ");
					String nome2 = sc.nextLine();
					System.out.println("Informe o preço do produto: ");
					double preco = sc.nextDouble();
					sc.nextLine();
					produto = new Produto(nome2, preco);
					break;
				case 3:
					if(produto != null) {
						produto.exibirInformacoes();
					}
					else {
						System.out.println("Produto ainda não criado.");
					}
					break;
				case 4:
					if(produto != null) {
						System.out.println("Digite o nome que deseja atribuir: ");
						String nome4 = sc.nextLine();
						produto.setNome(nome4);
						System.out.println("Nome atribuido.");
					}
					else {
						System.out.println("Produto ainda não criado.");
					}
					break;
				case 5:
					if(produto != null) {
						System.out.println("Nome do produto: " + produto.getNome());
					}
					else {
						System.out.println("Produto ainda não criado.");
					}
					break;
				case 6:
					if(produto != null) {
						System.out.println("Digite o preço que deseja atribuir: ");
						double preco6 = sc.nextDouble();
						sc.nextLine();
						produto.setPreco(preco6);
						System.out.println("Preço atribuido.");
					}
					else {
						System.out.println("Produto ainda não criado.");
					}
					break;
				case 7:
					if(produto != null) {
						System.out.println("Preço do produto: " + produto.getPreco());
					}
					else {
						System.out.println("Produto ainda não criado.");
					}
					break;
				case 8:
					if(produto != null) {
						System.out.println("Digite a quantidade que deseja atribuir: ");
						int quantidade = sc.nextInt();
						sc.nextLine();
						produto.setQuantidadeEstoque(quantidade);
						System.out.println("Quantidade atribuida.");
					}
					else {
						System.out.println("Produto ainda não criado.");
					}
					break;
				case 9:
					if(produto != null) {
						System.out.println("Quantidade do produto: " + produto.getQuantidadeEstoque());
					}
					else {
						System.out.println("Produto ainda não criado.");
					}
					break;
				case 0:
					System.out.println("Saindo.");
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}
		sc.close();
	}

}
