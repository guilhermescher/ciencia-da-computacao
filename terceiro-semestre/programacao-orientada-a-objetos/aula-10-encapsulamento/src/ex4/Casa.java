package ex4;

public class Casa {
    public double calcularPreco(int tamanho){
        return tamanho * 100;
    }
    public double calcularPreco(int tamanho, int quarto){
        return tamanho * quarto * 30;
    }

    public static void main(String[] args) {
        Casa casa = new Casa();
        System.out.println(casa.calcularPreco(300));
        System.out.println(casa.calcularPreco(300, 3));
    }
}
