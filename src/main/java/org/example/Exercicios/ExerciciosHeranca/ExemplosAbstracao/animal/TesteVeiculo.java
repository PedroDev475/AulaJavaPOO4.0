package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal;

public class TesteVeiculo {
    public static void main(String[] args) {
        ligarEAcelerarVeiculo( new Carro(),10);
        ligarEAcelerarVeiculo(new Moto(),20);

    }
    public static void  ligarEAcelerarVeiculo(Veiculo veiculo,int incremento ){
        veiculo.ligar();
        veiculo.acelarar(incremento);

    }

}
