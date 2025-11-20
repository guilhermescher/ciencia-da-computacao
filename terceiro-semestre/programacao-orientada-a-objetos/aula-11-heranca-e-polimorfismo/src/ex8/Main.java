package ex8;

public class Main {
    public static void main(String[] args) {
        Reserva reservaHotel = new ReservaDeHotel();
        reservaHotel.adicionar();
        reservaHotel.cancelar();

        ReservaDeVoo reservaVoo = new ReservaDeVoo();
        reservaVoo.adicionar("Econômica");
        reservaVoo.adicionar("Executiva");
        reservaVoo.cancelar();

        Reserva reservaPoli = new ReservaDeVoo();
        reservaPoli.adicionar();
        reservaPoli.cancelar();
    }
}
