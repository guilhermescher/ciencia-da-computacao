package ex4;

public class Main {
    public static void main(String[] args) {
        /*4 - Escreva um programa Java que use um laço para somar os números de 1 a 100.*/
        int soma = 0;
        for(int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}
