package ex8;

public class ReservaDeVoo extends Reserva {
    @Override
    public void cancelar() {
        System.out.println("Cancelamento de voo realizado com taxa de 20%.");
    }

    public void adicionar(String classe) {
        System.out.println("Reserva de voo adicionada na classe: " + classe);
    }
}
