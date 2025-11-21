package exercicio_2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(10,20));
        System.out.println(calculadora.subtrair(10,5));
        System.out.println(calculadora.multiplicar(10,5));
        System.out.println(calculadora.dividir(50,2));
        System.out.println(calculadora.raizQuadrada(25));
        System.out.println(calculadora.elevarPotencia(3,3));
        System.out.println(calculadora.logaritmo10(100));
    }
}
