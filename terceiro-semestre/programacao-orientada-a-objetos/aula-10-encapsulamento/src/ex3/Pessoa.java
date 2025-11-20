package ex3;

import java.util.Scanner;

public class Pessoa {
    public void falar(String mensagem){
        System.out.println(mensagem);
    }
    public void falar(String mensagem, int quantidade){
        if(quantidade > 0){
            System.out.println(mensagem);
            falar(mensagem, quantidade - 1);
        }
    }
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma mensagem: ");
        String mensagem = sc.nextLine();
        System.out.println("Digite quantidade de mensagem: ");
        int quantidade = sc.nextInt();
        p.falar(mensagem, quantidade);
    }
}
