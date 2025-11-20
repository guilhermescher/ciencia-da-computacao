package pkg;

public class ProdutoEletronico extends Produto {
    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    public void aplicarDesconto(int x, double desconto){
        if(x == 1){
            setDesconto(desconto);
            setPreco(getPreco() - getDesconto());
            System.out.println("Desconto aplicado com sucesso!");
        }
        else if(x == 2){
            setDesconto(desconto);
            setPreco(getPreco() * getDesconto());
            System.out.println("Desconto aplicado com sucesso!");
        }
        else{
            System.out.println("Resposta inválida, tente novamente.");
        }
    }

    public void calcularPrecoFinal(double taxa){
        System.out.println("Preço final com a taxa: " + (getPreco() + taxa));
        setPreco(getPreco() + taxa);
    }


}
