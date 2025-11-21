/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrodealunos;

/**
 *
 * @author scher
 */
public class Aluno {
    private String nome;
    private String nascimento; // formato DD/MM/AAAA
    private String sexo;
    private String matricula;
    private String curso;
    private String cpf;
    private String endereco;
    private String estado;
    private String telefone;

    public Aluno(String nome, String nascimento, String sexo, String matricula,
                 String curso, String cpf, String endereco, String estado, String telefone) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estado = estado;
        this.telefone = telefone;
    }

    // getters
    public String getNome() { return nome; }
    public String getNascimento() { return nascimento; }
    public String getSexo() { return sexo; }
    public String getMatricula() { return matricula; }
    public String getCurso() { return curso; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getEstado() { return estado; }
    public String getTelefone() { return telefone; }

    // salvar em linha de arquivo
    public String toFileString() {
        return nome + ";" + nascimento + ";" + sexo + ";" + matricula + ";" +
               curso + ";" + cpf + ";" + endereco + ";" + estado + ";" + telefone;
    }

    // recriar a partir de linha
    public static Aluno fromFileString(String linha) {
        String[] p = linha.split(";");
        return new Aluno(p[0], p[1], p[2], p[3], p[4], p[5], p[6], p[7], p[8]);
    }
}
