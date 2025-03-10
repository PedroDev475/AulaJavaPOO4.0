package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

abstract class Veiculo {
    int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }
    void acelarar(int incremente){
        velocidade += incremente;
        System.out.println(" Acelerando para a velocidade " + velocidade + " Km/h ");
    }
    abstract void ligar();

}

