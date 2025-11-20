package ex4;

import java.util.Scanner;

public class Notebook extends Computador {
    public Notebook(String marca) {
        super(marca);
    }

    public String exibeMarca(){
        return marca;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a marca do notebook: ");
        String marca = sc.nextLine();
        sc.close();
        Notebook notebook = new Notebook(marca);
        System.out.println(notebook.exibeMarca());
        System.out.print(notebook.exibeModelo());
    }
}
