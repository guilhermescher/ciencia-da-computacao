package ex9;

public class Main {
    public static void main(String[] args) {
        /*9 - Escreva um programa Java que use um laço para imprimir os números primos de 1 a 50.*/
        System.out.println("1 é primo.");
        for(int i = 1; i <= 50; i++){
            int j;
            for(j = 2; j < i; j++){
                if(i % j == 0) {
                    System.out.println(i + " não é primo.");
                    break;
                }
            }
            if(i == j){
                System.out.println(i+" é primo.");
            }
        }
    }
}
