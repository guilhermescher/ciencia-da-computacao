package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um valor para converter ");
            String entrada = scanner.nextLine();
            double valor = Double.parseDouble(entrada);
            System.out.println("O valor convertido é " + valor);

            System.out.print("Digite um número inteiro ");
            int numero = Integer.parseInt(scanner.nextLine());
            int resultado = numero / 0;
            System.out.println("Resultado " + resultado);

            String texto = null;
            System.out.println("Comprimento da string " + texto.length());

        } catch (NumberFormatException e) {
            System.out.println("Erro, não digitou número ");
        } catch (ArithmeticException e) {
            System.out.println("Erro, não da pra dividir por 0");
        } catch (NullPointerException e) {
            System.out.println("Não pode acessar obj nulo");
        }
        scanner.close();
    }
}
