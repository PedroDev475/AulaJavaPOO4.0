package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.smartwhatch;

public class Main {
    public static void main(String[] args) {

       SmartWhatchAvancado smartWhatchAvancado = new SmartWhatchAvancado();

        smartWhatchAvancado.contarPassos();
        smartWhatchAvancado.medirFrequenciaCardiaca();
        smartWhatchAvancado.medirQualidadeSono();
    }
}
