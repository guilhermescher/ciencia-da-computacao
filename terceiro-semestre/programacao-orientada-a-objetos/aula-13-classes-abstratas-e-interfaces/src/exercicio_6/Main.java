package exercicio_6;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Guilherme", "Santa Maria", "123");
        PessoaJuridica pj = new PessoaJuridica("UFN", "Santa Maria", "987");
        pf.efetuarCompra();
        pj.efetuarCompra();
    }
}
