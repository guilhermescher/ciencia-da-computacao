package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        try {
            Pessoa pessoa = new Pessoa(idade);
            System.out.print("Idade: " + pessoa.getIdade());
        } catch (ExcecaoIdade e) {
            System.out.print("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
