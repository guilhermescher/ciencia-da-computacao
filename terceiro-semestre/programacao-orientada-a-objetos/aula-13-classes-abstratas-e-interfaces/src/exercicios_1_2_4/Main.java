package exercicios_1_2_4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000, 100);
        ContaInvestimento ci = new ContaInvestimento(2000, 200);
        cc.exibirDados();
        ci.exibirDados();
        cc.depositar(2000);
        ci.depositar(2000);
        cc.sacar(90);
        ci.sacar(180);
    }
}
