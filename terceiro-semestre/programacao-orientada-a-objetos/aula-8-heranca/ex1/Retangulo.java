package ex1;

public class Retangulo extends Figura {
    private double largura;
    private double altura;

    public Retangulo(String cor, String preenchido, double largura, double altura) {
        super(cor, preenchido);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}
