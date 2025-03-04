package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class AuxilioTransporte extends  Beneficio {
    public AuxilioTransporte(double valor) {
        super("Auxilio Transporte", valor);
    }

    @Override
    public double CalcularDesconto(double salario) {
        return  Math.min(getValor(),salario * 0.06);
    }
}

