package ex7;

public class NotificacaoEmail extends Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por e-mail para um destinatário");
    }

    public void enviar(String... destinatarios) {
        for (String destinatario : destinatarios) {
            System.out.println("Enviando e-mail para: " + destinatario);
        }
    }
}
