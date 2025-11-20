package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Usuario u = new Usuario();
        u.nomeUsuario = "admin";
        u.senha = "1234";

        System.out.print("Usuário: ");
        String user = sc.nextLine();
        System.out.print("Senha: ");
        String pass = sc.nextLine();

        if (u.login(user, pass)) {
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Falha no login.");
        }

        u.exibirStatus();
        u.logout();
        u.exibirStatus();
    }
}
