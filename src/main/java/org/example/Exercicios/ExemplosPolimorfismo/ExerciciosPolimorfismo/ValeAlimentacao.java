package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class ValeAlimentacao extends Beneficio{
    public ValeAlimentacao( double valor) {
        super("valeAlimentacao", valor);
    }

    @Override
    public double CalcularDesconto(double salario) {
        return (getValor());
    }


        }





