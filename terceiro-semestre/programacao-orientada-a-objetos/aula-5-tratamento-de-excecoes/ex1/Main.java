package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro ");
            int numero = Integer.parseInt(scanner.nextLine());

            if (numero < 0) {
                throw new IllegalArgumentException("Não dá pra calcular a raiz quadrada de um número negativo");
            }

            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é " + raiz);
        } catch (NumberFormatException e) {
            System.out.println("Não digitou número inteiro ");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro " + e.getMessage());
        }
        scanner.close();
    }
}