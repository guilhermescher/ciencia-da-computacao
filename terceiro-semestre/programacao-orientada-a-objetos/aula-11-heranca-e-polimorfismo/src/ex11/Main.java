package ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("ana", 25, 'F'));
        pessoas.add(new Pessoa("gui", 30, 'M'));
        pessoas.add(new Pessoa("angela", 22, 'F'));
        pessoas.add(new Pessoa("otavio", 40, 'M'));
        pessoas.add(new Pessoa("rose", 19, 'F'));

        int qtdMulheres = contarMulheres(pessoas);
        System.out.println("Quantidade de mulheres: " + qtdMulheres);
    }

    public static int contarMulheres(List<Pessoa> pessoas) {
        int contador = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo() == 'F') {
                contador++;
            }
        }
        return contador;
    }
}
