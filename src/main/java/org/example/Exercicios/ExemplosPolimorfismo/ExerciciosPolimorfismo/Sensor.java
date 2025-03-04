package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class Sensor {
    private String nome;
    private double valor;

    public Sensor(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    public String reportarValor(){
        return "Sensor" + nome + ":" + valor;

}
    }
