package exercicio_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que você deseja adicionar aos salários: ");
        double valor = sc.nextDouble();
        Vendedor vendedor = new Vendedor("Guilherme", 1000);
        Gerente gerente = new Gerente("Zamberlan", 2000);
        vendedor.calcularSalario(valor);
        gerente.calcularSalario(valor);
        sc.close();
    }
}
