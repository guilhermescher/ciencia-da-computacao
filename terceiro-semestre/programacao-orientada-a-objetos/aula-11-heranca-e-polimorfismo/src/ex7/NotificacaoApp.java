package ex7;

public class NotificacaoApp extends Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação via aplicativo");
    }
}
