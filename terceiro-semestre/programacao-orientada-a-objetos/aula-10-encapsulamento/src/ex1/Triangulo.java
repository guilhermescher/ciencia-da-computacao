package ex1;

public class Triangulo extends FormaGeometrica {
    public void calcularArea(double base, double altura) {
        System.out.println(base * altura / 2);
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.calcularArea(4, 4);
    }
}
