package org.example.Exercicios.ExerciciosHeranca;


    public class Main {
        public static void main(String[] args) {
            Professor professor1 = new Professor("João", 2500, "Matemática");
            Professor professor2 = new Professor("Maria", 3000, "Português");

            Coordenador coordenador = new Coordenador("Ana", 5000);
            coordenador.adicionarProfessor(professor1);
            coordenador.adicionarProfessor(professor2);

            // Imprimindo informações sobre o coordenador e sua equipe
            System.out.println("Coordenador: " + coordenador.getNome());
            for (Professor professor : coordenador.getEquipe()) {
                System.out.println("Professor: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
            }
        }
    }
