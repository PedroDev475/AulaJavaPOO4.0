package org.example.Exercicios.ExerciciosHeranca;

class SistemaDeAtendimentoMedico {

        public static void main(String[] args) {
            Paciente p1 = new Paciente("Pedro", 20);
            PacienteParticular p2 = new PacienteParticular("Maria", 30, 200.0);
            PacienteCovenio p3 = new PacienteCovenio("João", 40, 20);

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
        }
    }
