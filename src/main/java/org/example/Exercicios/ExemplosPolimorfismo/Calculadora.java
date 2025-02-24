package org.example.Exercicios.ExemplosPolimorfismo;

public class Calculadora {
  //Metodo para somar dois inteiros
    int somar(int a, int b) {
        return a + b;
    }
// Metodo para somar tres inteiros (mesmos nome,diferente quantidade de parametros)
    int somar(int a, int b, int c) {
        return a + b + c;
    }
// Metodo para somar dois numeros de ponto flutuante (mesmo nome, diferente tipos de parametros)
    double somar(double a, double b) {
        return a + b;
    }
}
