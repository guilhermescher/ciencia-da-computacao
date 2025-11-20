package ex6;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Gerente g1 = new Gerente("Carlos", 8000, 2000);
        Desenvolvedor d1 = new Desenvolvedor("Ana", 5000, 10);
        Desenvolvedor d2 = new Desenvolvedor("João", 4800, 5);

        funcionarios.add(g1);
        funcionarios.add(d1);
        funcionarios.add(d2);

        for (Funcionario f : funcionarios) {
            f.aumentarSalario(10);
            if (f instanceof Gerente) {
                ((Gerente) f).aumentarSalario(0, 500);
            }
        }

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
