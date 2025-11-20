package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        System.out.println("Digite a marca do carro: ");
        carro.setMarca(sc.nextLine());
        System.out.println("Digite o modelo do carro: ");
        carro.setModelo(sc.nextLine());
        System.out.println("Digite o ano do carro: ");
        carro.setAno(sc.nextInt());
        System.out.println(carro.exibeDetalhes());
    }
}
