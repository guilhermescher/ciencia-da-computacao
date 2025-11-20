package ex4;

import java.util.Scanner;

public class Netbook extends Computador {
    public Netbook(String marca) {
        super(marca);
    }

    public String exibeMarca(){
        return marca;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a marca do netbook: ");
        String marca = sc.nextLine();
        sc.close();
        Netbook netbook = new Netbook(marca);
        System.out.println(netbook.exibeMarca());
        System.out.print(netbook.exibeModelo());
    }
}
