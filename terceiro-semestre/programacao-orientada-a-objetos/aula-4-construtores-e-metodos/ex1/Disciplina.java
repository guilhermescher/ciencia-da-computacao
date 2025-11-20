package ex1;

public class Disciplina {
    public String nomeDisci, nomeProf;
    public int cargaHoraria;

    public void Adicionar(String nomeDisci, String nomeProf, int cargaHoraria) {
        this.nomeDisci = nomeDisci;
        this.nomeProf = nomeProf;
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisci() {
        return nomeDisci;
    }

    public String getProf() {
        return nomeProf;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
