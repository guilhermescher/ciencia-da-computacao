package ex2;

public class Main {
    public static void main(String[] args) {
        /*2 - Escreva um programa Java que use um laço para imprimir os números pares de 2 a 20.*/
        for(int i = 2; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
