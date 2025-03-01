package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class TesteReserva {
    public static void main(String[] args) {
        ReservaSimples reservaSimples = new ReservaSimples("Pedro",3,100.0);
        ReservaVIP reservaVIP = new ReservaVIP("Ana",5,150.0,0.1);
        System.out.println("Custo da reserva simples: R$" + reservaSimples.calcularCustoTotal());
        System.out.println("Custo da reserva VIP: R$" + reservaVIP.calcularCustoTotal());
    }
}
