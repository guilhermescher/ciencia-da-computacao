package ex7;

public class Main {
    public static void main(String[] args) {
        Notificacao notifGenerica = new Notificacao();
        notifGenerica.enviar();

        Notificacao notifEmail = new NotificacaoEmail();
        notifEmail.enviar();

        NotificacaoEmail email = new NotificacaoEmail();
        email.enviar("gui@email.com", "dog@email.com");

        Notificacao notifApp = new NotificacaoApp();
        notifApp.enviar();
    }
}
