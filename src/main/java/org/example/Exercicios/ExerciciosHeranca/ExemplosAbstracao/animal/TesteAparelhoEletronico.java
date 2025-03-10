package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

import org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.AparelhoEletronico;

public class TesteAparelhoEletronico {
    public static void main(String[] args) {
        LigarEDesligaAparelho(new Computador());
        LigarEDesligaAparelho(new Televisao());

    }
    public static void LigarEDesligaAparelho(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();

    }
}
