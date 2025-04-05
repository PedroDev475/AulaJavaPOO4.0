package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

public class VeiculoEntrega {
    protected double velocidadeAtual;
    protected double capacidadeCargaMaxima;
    protected double distanciaDestino;

    public VeiculoEntrega(double capacidadeCargaMaxima) {
        this.capacidadeCargaMaxima = capacidadeCargaMaxima;
        this.velocidadeAtual = 0; // Inicializa a velocidade como zero
        this.distanciaDestino = 0; // Inicializa a distância como zero
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public double getDistanciaDestino() {
        return distanciaDestino;
    }

    public void setDistanciaDestino(double distanciaDestino) {
        this.distanciaDestino = distanciaDestino;
    }

    public void aumentarVelocidade(double incremento) {
        this.velocidadeAtual += incremento;
    }


    public double calcularTempoEstimadoEntrega() {
        return 0;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Veículo:");
        System.out.println("  Tipo: " + this.getClass().getSimpleName());
        System.out.println("  Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("  Capacidade Máxima de Carga: " + capacidadeCargaMaxima + " kg");
        System.out.println("Detalhes da Entrega:");
        System.out.println("  Distância até o Destino: " + distanciaDestino + " km");
        System.out.println("  Tempo Estimado de Entrega: " + calcularTempoEstimadoEntrega() + " horas");
        System.out.println("-------------------------");
    }
}

