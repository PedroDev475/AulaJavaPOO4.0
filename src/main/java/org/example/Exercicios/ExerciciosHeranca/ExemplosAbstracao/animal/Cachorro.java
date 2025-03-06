package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

public class Cachorro extends Animal  {


    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " Está latindo: Au Au! ");
    }
}
