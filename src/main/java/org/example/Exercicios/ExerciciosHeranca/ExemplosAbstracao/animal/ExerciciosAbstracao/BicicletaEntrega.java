package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

import org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao.VeiculoEntrega;

public class BicicletaEntrega extends VeiculoEntrega {
    private double velocidadeMaxima;

    public BicicletaEntrega(double capacidadeCargaMaxima, double velocidadeMaxima) {
        super(capacidadeCargaMaxima);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void aumentarVelocidade(double incremento) {
        super.aumentarVelocidade(incremento);
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima; // Garante que a velocidade não ultrapasse o máximo
        }
    }

    @Override
    public double calcularTempoEstimadoEntrega() {
        if (velocidadeAtual > 0) {
            return distanciaDestino / velocidadeAtual;
        } else {
            return Double.POSITIVE_INFINITY; // Tempo infinito se a velocidade for zero
        }
    }
}