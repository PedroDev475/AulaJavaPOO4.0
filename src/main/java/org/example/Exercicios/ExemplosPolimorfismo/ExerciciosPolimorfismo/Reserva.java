package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class Reserva {
    private String nomeCliente;
    private int numeroNoites;
    private double precoPorNoite;

    public Reserva(String nomeCliente, int numeroNoites, double precoPorNoite) {
        this.nomeCliente = nomeCliente;
        this.numeroNoites = numeroNoites;
        this.precoPorNoite = precoPorNoite;
    }
    public double calcularCustoTotal(){
        return numeroNoites * precoPorNoite;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroNoites() {
        return numeroNoites;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }
}

