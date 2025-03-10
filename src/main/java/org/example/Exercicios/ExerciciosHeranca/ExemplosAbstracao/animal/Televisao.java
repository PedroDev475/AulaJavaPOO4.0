package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

import org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.AparelhoEletronico;

public class Televisao implements AparelhoEletronico {

    @Override
    public void ligar() {
        System.out.println(" TV Ligada! ");
    }

    @Override
    public void desligar() {
        System.out.println(" TV Desligada! ");

    }
}
