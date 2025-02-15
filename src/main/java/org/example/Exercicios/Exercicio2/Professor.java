package org.example.Exercicios.Exercicio2;

public class Professor extends Funcionario {
    private String disciplina;

    // Construtor
    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    // Getter e setter para disciplina
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
