package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

public class Gato extends Animal {


    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " Está Miando: Miau Miau! ");
    }
}
