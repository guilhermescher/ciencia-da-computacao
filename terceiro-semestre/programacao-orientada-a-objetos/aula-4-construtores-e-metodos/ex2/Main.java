package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("hary poter", "scher", "fantasia", 2005, false);
        boolean i = true;
        do {
            System.out.println("Digite o que você deseja realizar: 1 - Mostrar as informações do livro\n2 - Pegar o livro emprestado\n3 - Devolver o livro\n4 - Sair\n");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(l);
                    break;
                case 2:
                    l.Emprestimo();
                    break;
                case 3:
                    l.Devolucao();
                    break;
                case 4:
                    i = false;
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }while(i);
    }
}
