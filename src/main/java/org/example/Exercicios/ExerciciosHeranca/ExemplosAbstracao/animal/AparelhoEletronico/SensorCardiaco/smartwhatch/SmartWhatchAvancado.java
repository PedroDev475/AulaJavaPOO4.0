package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.smartwhatch;

import org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.SensorCardiaco;
import org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.SensorPassos;
import org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.SensorSono;

public class SmartWhatchAvancado implements SensorCardiaco, SensorPassos, SensorSono {


    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println(" medição cardiaca: 80bpm ");
    }

    @Override
    public void contarPassos() {
        System.out.println(" Passos hoje: 400 passos ");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println(" Qualidade do sono: Sono Profundo ");

    }
}
