package ex3;

public class Main {
    public static void main(String[] args) {
        Agenda agendaum = new Agenda();
        agendaum.adicionarContato("Gui", "123");
        Agenda agendadois = new Agenda();
        agendadois.adicionarContato("Otávio", null);
        Agenda agendatres = new Agenda();
        agendatres.adicionarContato(null, "456");
    }
}