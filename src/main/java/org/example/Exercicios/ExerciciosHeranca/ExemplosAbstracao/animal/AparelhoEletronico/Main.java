package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro() {
            @Override
            public void buzinar() {

            }
        };

        carro.buzinar();
        carro.acelerar();
    }
}
