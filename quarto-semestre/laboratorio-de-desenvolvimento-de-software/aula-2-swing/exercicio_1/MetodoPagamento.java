package exercicio_1;

import java.util.Random;

public abstract class MetodoPagamento {
    private String nomeMetodo;
    private int idPagamento;

    Random random = new Random();

    public MetodoPagamento(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
        this.idPagamento = random.nextInt(0,999999999);
    }

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public int getIdPagamento() {
        return idPagamento;
    }
}
