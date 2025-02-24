package org.example.Exercicios.ExemplosPolimorfismo;

public class GestaoFrota {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Toyota Corolla"),
                new Moto("Honda CB500"),
                new Caminhao("Volvo FH")
        };
        for (Veiculo v : frota){
            v.realizarManutencao();
        }
    }

}
