package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

 class ReservaSimples extends Reserva {
     public ReservaSimples(String nomeCliente, int numeroNoites, double precoPorNoite) {
         super(nomeCliente, numeroNoites, precoPorNoite);
     }

     @Override
     public double calcularCustoTotal() {
         return getNumeroNoites() * getPrecoPorNoite();
     }
 }
