package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um valor pra converter pra double: ");
            String entrada = scanner.nextLine();
            double valor = Double.parseDouble(entrada);

            System.out.println("O valor convertido é " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Erro, não é um número.");
        }
        scanner.close();
    }
}
