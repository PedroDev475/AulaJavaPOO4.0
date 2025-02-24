package org.example.Exercicios.ExemplosPolimorfismo;

public class Teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2,3));      // Chama o primeiro metodo
        System.out.println(calc.somar(2,3,4)); // Chama o segundo metodo

        System.out.println(calc.somar(2.5,3.7));  //Chama o terceiro metodo
    }
}
