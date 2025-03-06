package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Vitor");
        Gato gato = new Gato("Tom");

        emitirSom(cachorro);
        emitirSom(gato);

        List<Animal> listaAnimal = new ArrayList<>();

        listaAnimal.add(cachorro);
        listaAnimal.add(gato);

        listaAnimal.forEach(Animal::dormir);
        listaAnimal.forEach(Animal::fazerSom);



    }

    public static void emitirSom(Animal animal){
        animal.fazerSom();


    }
}
