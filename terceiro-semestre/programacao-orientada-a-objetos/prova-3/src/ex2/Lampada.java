package ex2;

public class Lampada implements Controlavel{

    private String estadoAtual;

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    @Override
    public void ligar() {
        setEstadoAtual("acesa");
        System.out.println("Lâmpada ligada. Estado atual: " + getEstadoAtual());
    }

    @Override
    public void desligar() {
        setEstadoAtual("apagada");
        System.out.println("Lâmpada desligada. Estado atual: " + getEstadoAtual());
    }
}
