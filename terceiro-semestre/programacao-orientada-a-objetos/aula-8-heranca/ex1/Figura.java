package ex1;

public class Figura {
    protected String cor;
    protected String preenchido;

    public Figura(String cor, String preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public void setPreenchido(String preenchido) {
        this.preenchido = preenchido;
    }
}
