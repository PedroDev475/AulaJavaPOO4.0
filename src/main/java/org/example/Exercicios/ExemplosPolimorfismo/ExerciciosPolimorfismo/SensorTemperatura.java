package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class SensorTemperatura extends Sensor{
    public SensorTemperatura(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String reportarValor() {
        return "Sensor Temperatura" + getNome() + ":" + getValor() + "°C";
    }
}
