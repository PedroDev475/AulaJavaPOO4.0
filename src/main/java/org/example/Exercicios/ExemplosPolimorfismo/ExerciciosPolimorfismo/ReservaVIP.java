package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

 class ReservaVIP extends Reserva {
     private double desconto;

     public ReservaVIP(String nomeCliente, int numeroNoites, double precoPorNoite, double desconto) {
         super(nomeCliente, numeroNoites, precoPorNoite);
         this.desconto = desconto;
     }

     @Override
     public double calcularCustoTotal() {
         return (getNumeroNoites() * getPrecoPorNoite()) * (1 - desconto);
     }
 }
