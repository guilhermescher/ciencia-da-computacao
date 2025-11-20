package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o tipo: ");
        String tipo = sc.nextLine();
        Pessoa pessoa = new Pessoa(tipo, nome, idade);
        System.out.println(pessoa.toString());
        System.out.println(pessoa.falar());
        System.out.print(pessoa.andar());
    }
}
