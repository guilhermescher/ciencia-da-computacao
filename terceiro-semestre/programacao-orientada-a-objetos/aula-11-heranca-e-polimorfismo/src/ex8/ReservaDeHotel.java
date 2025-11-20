package ex8;

public class ReservaDeHotel extends Reserva {
    @Override
    public void cancelar() {
        System.out.println("Cancelamento de hotel realizado com taxa de 10%.");
    }
}
