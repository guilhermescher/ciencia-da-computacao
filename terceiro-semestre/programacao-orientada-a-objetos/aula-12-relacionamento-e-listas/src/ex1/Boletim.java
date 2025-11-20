package ex1;

public class Boletim {
    public void imprimirStatus(Aluno a){
        if(a.getNotaFinal() >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}