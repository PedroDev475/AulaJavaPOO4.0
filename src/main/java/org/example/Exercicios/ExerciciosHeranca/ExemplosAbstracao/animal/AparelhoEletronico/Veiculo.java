package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico;

public interface Veiculo {
    void acelerar();
     default void buzinar(){
        System.out.println(" BEE BEE!!! ");
    }
}
