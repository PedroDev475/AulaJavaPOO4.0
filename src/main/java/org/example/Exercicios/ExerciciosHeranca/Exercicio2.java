package org.example.Exercicios.ExerciciosHeranca;
import java.util.ArrayList;
import java.util.List;

class Coordenador extends Funcionario {
    private List<Professor> equipe;

    // Construtor
    public Coordenador(String nome, double salario) {
        super(nome, salario);
        this.equipe = new ArrayList<>();
    }

    // Método para adicionar um professor à equipe
    public void adicionarProfessor(Professor professor) {
        equipe.add(professor);
    }

    // Método para remover um professor da equipe
    public void removerProfessor(Professor professor) {
        equipe.remove(professor);
    }

    // Getter para a equipe
    public List<Professor> getEquipe() {
        return equipe;
    }
}