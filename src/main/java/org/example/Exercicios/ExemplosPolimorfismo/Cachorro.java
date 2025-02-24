package org.example.Exercicios.ExemplosPolimorfismo;

public class Cachorro extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O cachorro late: AU AU!");
    }
}
