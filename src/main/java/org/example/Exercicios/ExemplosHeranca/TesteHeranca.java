package org.example.Exercicios.ExemplosHeranca;

public class TesteHeranca {
    public static void main(String[] args) {
        Carro Carro = new Carro("BMW", 2023, 4);
        Moto moto = new Moto("Honda", 2023, true);

        System.out.println("Detalhes do Carro:");
        Carro.exibirDetalhes();

        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
    }
}
