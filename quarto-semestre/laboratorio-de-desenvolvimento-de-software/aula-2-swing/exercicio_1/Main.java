package exercicio_1;

public class Main {
    public static void main(String[] args) {
        CartaoCreditoPagamento cc = new CartaoCreditoPagamento("Cartão de Crédito");
        PayPalPagamento pp = new PayPalPagamento("PayPal");
        PIXPagamento pix = new PIXPagamento("Pix");

        cc.processaPagamento(1000);
        cc.mostraDetalhesPagamento();
        pp.processaPagamento(2000);
        pp.mostraDetalhesPagamento();
        pix.processaPagamento(3000);
        pix.mostraDetalhesPagamento();
    }
}
