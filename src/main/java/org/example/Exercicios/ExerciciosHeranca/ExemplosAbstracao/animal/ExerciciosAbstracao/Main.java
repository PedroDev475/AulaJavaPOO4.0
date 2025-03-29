package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

public class Main {
    public static void main(String[] args) {

        FlySecure companhia = new FlySecure();


        companhia.validarDocumento("12345678901");
        companhia.emitirCartaoEmbarque("Pedro Henrique");

        companhia.validarDocumento("1234567890");
        companhia.emitirCartaoEmbarque("Juliana Oliveira");
    }
}

