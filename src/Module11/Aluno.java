package Module11;

import java.util.Date;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double nota;

    // Construtor
    public Aluno(String nome, int idade, String curso, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.nota = nota;

    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", curso='" + curso + '\'' +
                ", nota=" + nota +
                '}';
    }
}
