package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = scanner.nextLine().charAt(0);

            System.out.print("Digite o segundo número: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double resultado;
            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Divisão por zero não dá.");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Operador inválido.");
            }

            System.out.println("Resultado " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro, digite um número válido.");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Erro " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}