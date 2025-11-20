package ex2;

public class Televisao implements Controlavel{

    private String canalInicial;

    public Televisao(String canalInicial) {
        this.canalInicial = canalInicial;
    }

    public String getCanalInicial() {
        return canalInicial;
    }

    public void setCanalInicial(String canalInicial) {
        this.canalInicial = canalInicial;
    }

    @Override
    public void ligar() {
        System.out.println("Televisão ligada. Canal inicial: " + getCanalInicial());
    }

    @Override
    public void desligar() {
        System.out.println("Televisão desligada.");
    }
}
