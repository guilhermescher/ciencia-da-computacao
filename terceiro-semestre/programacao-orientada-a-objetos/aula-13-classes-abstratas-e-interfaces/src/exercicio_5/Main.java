package exercicio_5;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "Voyage", 2022);
        Moto moto = new Moto("Honda", "NX4-Falcon", 2008);
        carro.Acelerar();
        carro.Frear();
        moto.Acelerar();
        moto.Frear();
    }
}
