package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;


    public class MotoEntrega extends VeiculoEntrega {
        private double fatorAtrasoTransito;

        public MotoEntrega(double capacidadeCargaMaxima, double fatorAtrasoTransito) {
            super(capacidadeCargaMaxima);
            this.fatorAtrasoTransito = fatorAtrasoTransito;
        }

        public double getFatorAtrasoTransito() {
            return fatorAtrasoTransito;
        }

        public void setFatorAtrasoTransito(double fatorAtrasoTransito) {
            this.fatorAtrasoTransito = fatorAtrasoTransito;
        }

        @Override
        public double calcularTempoEstimadoEntrega() {
            if (velocidadeAtual > 0) {
                return (distanciaDestino / velocidadeAtual) * (1 + fatorAtrasoTransito);
            } else {
                return Double.POSITIVE_INFINITY;
            }
        }
    }

