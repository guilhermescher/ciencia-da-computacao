package ex2;

public class ContaCorrente extends ContaBancaria{
    double saldo;
    public void calcularSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.saldo = 100;
        cc.calcularSaldo();
    }
}
