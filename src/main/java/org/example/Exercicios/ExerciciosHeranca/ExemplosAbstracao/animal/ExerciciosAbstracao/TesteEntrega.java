package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

public class TesteEntrega {
    public static void main(String[] args) {
        MotoEntrega motoEntrega = new MotoEntrega(15, 0.2);
        BicicletaEntrega bicicletaEntrega = new BicicletaEntrega(5, 20);

        motoEntrega.setDistanciaDestino(10);
        motoEntrega.aumentarVelocidade(15);
        motoEntrega.exibirDetalhes();

        bicicletaEntrega.setDistanciaDestino(50);
        bicicletaEntrega.aumentarVelocidade(15);
        bicicletaEntrega.exibirDetalhes();
    }


    }


