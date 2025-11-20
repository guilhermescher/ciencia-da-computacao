package ex2;

public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao("1");
        Lampada lampada = new Lampada();
        televisao.ligar();
        televisao.desligar();
        lampada.ligar();
        System.out.println(lampada.getEstadoAtual());
        lampada.desligar();
        System.out.println(lampada.getEstadoAtual());
    }
}
