package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class SensorUmidade extends Sensor{
    public SensorUmidade(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String reportarValor() {
        return "Sensor Umidade" + getNome() + ":" + getValor() + "%";
}
    }
