package org.example.Exercicios.ExemplosPolimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {

        Animal meuAnimal1 = new Cachorro();   //Objeto da classe cachorro
        Animal meuAnimal2 = new Gato();     // Objeto da classe gato

        meuAnimal1.fazerSom();    //Chama o metodo sobrescrito da classe cachorro
        meuAnimal2.fazerSom();     //Chama o metodo sobrescrito da classe gato
    }
}
