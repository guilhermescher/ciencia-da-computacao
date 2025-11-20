package ex2;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void validarTriangulo () throws IllegalArgumentException {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Os lados do triângulo devem ser maiores que zero.");
        }
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("A soma de dois lados deve ser maior que o terceiro lado.");
        }
    }
}
