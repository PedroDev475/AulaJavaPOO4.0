package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    void dormir(){
        System.out.println(nome + " Está dormindo. ");

    }
    abstract public  void fazerSom();



    }


