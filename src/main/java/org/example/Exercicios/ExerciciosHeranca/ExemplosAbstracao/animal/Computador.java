package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

import org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.AparelhoEletronico;

public class Computador implements AparelhoEletronico {

    @Override
    public void ligar() {
        System.out.println(" Computador Ligado! ");
    }

    @Override
    public void desligar() {
        System.out.println(" Computador Desligado! ");

    }
}
