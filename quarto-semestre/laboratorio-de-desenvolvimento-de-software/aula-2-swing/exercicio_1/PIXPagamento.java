package exercicio_1;

public class PIXPagamento extends MetodoPagamento{
    public PIXPagamento(String nomeMetodo) {
        super(nomeMetodo);
    }

    public void processaPagamento(double valor){
        System.out.println("Pagamento via " + getNomeMetodo() + " processado com sucesso. Valor: " + valor);
    }

    public void mostraDetalhesPagamento(){
        System.out.println("Detalhes de pagamento:\nMétodo utilizado: " + getNomeMetodo() + "\nID do pagamento: " + getIdPagamento() + "\n");
    }
}
