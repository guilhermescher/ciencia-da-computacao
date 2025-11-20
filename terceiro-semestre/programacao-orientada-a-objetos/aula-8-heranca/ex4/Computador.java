package ex4;

public class Computador {
    protected String marca;
    protected String modelo = "Portátil";

    public Computador(String marca) {
        this.marca = marca;
    }

    public String exibeModelo() {
        return modelo;
    }
}
