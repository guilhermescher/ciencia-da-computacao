package ex1;

public class Main {
    public static void main(String[] args) {
        FuncionarioCLT clt = new FuncionarioCLT("Guilherme", 1000);
        FuncionarioPJ pj = new FuncionarioPJ("Otávio", 2000);
        clt.exibirDados();
        System.out.println("Salário final de " + clt.getNome() + ": " + clt.calcularSalarioFinal());
        pj.exibirDados();
        System.out.println("Salário final de " + pj.getNome() + ": " + pj.calcularSalarioFinal());
    }
}