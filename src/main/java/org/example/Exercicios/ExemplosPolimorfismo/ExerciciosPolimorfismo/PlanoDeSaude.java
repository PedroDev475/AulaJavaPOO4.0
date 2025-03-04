package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class PlanoDeSaude extends Beneficio {
    public PlanoDeSaude(double valor) {
        super("Plano de Saude", valor);
    }

    @Override
    public double CalcularDesconto(double salario) {
        return salario * 0.10;
    }
}

