package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class SistemaMonitoramento {
    public static void main(String[] args) {
        SensorTemperatura sensorTemperatura = new SensorTemperatura("1",25.5);
        SensorUmidade sensorUmidade = new SensorUmidade("1",60.0);

        System.out.println(sensorTemperatura.reportarValor());
        System.out.println(sensorUmidade.reportarValor());
    }
}
