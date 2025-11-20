package ex8;

public class Usuario {
    String nomeUsuario;
    String senha;
    boolean logado = false;

    boolean login(String usuario, String senha) {
        if (this.nomeUsuario.equals(usuario) && this.senha.equals(senha)) {
            logado = true;
            return true;
        }
        return false;
    }

    void logout() {
        logado = false;
    }

    void exibirStatus() {
        System.out.println(logado ? "Usuário logado" : "Usuário deslogado");
    }
}
