package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ProdutoEletronico> produtosEletronicos = new ArrayList<>();
        List<ProdutoAlimenticio> produtosAlimenticios = new ArrayList<>();
        int opc = 5;
        while (opc != 0) {
            System.out.println("Digite a ação que você deseja realizar: ");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Aplicar desconto no produto");
            System.out.println("3 - Calcular o preço final dos produtos");
            System.out.println("4 - Exibir os produtos");
            System.out.println("5 - Sair");
            opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
                case 1:
                    int p = 0;
                    System.out.print("Digite 1 para produto eletrônico ou 2 para produto alimentício: ");
                    p = scanner.nextInt();
                    scanner.nextLine();
                    if(p == 1) {
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o valor do produto: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        ProdutoEletronico produtoEletronico = new ProdutoEletronico(nome, valor);
                        produtosEletronicos.add(produtoEletronico);
                    }
                    else if(p == 2) {
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o valor do produto: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio(nome, valor);
                        produtosAlimenticios.add(produtoAlimenticio);
                    }
                    else{
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Digite a opção do produto que você deseja aplicar o desconto\n1 - Eletrônico\n2 - Alimentício\nDigite: ");
                    int d = scanner.nextInt();
                    scanner.nextLine();
                    if(d == 1) {
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        if(produtosEletronicos.isEmpty()) {
                            System.out.println("Nenhum produto cadastrado.");
                        }
                        else {
                            for(ProdutoEletronico produto : produtosEletronicos){
                                if(produto.getNome().equals(nome)) {
                                    int x = 0;
                                    System.out.print("Escolha uma opção\n1 - Desconto por valor fixo\n2 - Desconto por percentual\nDigite: ");
                                    x = scanner.nextInt();
                                    System.out.print("Digite o desconto: ");
                                    double desconto = scanner.nextDouble();
                                    produto.aplicarDesconto(x, desconto);
                                }
                            }
                        }
                    }
                    else if(d == 2) {
                        System.out.print("Digite o nome do produto: ");
                        String nome = scanner.nextLine();
                        if(produtosAlimenticios.isEmpty()) {
                            System.out.println("Nenhum produto cadastrado.");
                        }
                        else {
                            for(ProdutoAlimenticio produto : produtosAlimenticios){
                                if(produto.getNome().equals(nome)) {
                                    System.out.println("Informe o desconto (em percentual): ");
                                    double desconto = scanner.nextDouble();
                                    produto.aplicarDesconto(desconto);
                                }
                            }
                        }
                    }
                    else{
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    for(ProdutoEletronico produto : produtosEletronicos){
                        System.out.print("Informe a taxa de garantia de " + produto.getNome() + " (em valor fixo): ");
                        double taxa = scanner.nextDouble();
                        produto.calcularPrecoFinal(taxa);
                    }
                    for(ProdutoAlimenticio produto : produtosAlimenticios){
                        System.out.print("Informe o desconto por validade próxima de " + produto.getNome() + " (em porcentagem, digite 1 se não houver): ");
                        double descontoValidade = scanner.nextDouble();
                        produto.calcularPrecoFinal(descontoValidade);
                    }
                    break;
                case 4:
                    for(ProdutoEletronico produto : produtosEletronicos){
                        System.out.println(produto.toString());
                    }
                    for(ProdutoAlimenticio produto : produtosAlimenticios){
                        System.out.println(produto.toString());
                    }
                    break;
                case 5:
                	opc = 0;
                	scanner.close();
                    break;
            }
        }
    }
}
