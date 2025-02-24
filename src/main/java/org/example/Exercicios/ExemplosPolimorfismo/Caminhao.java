package org.example.Exercicios.ExemplosPolimorfismo;

 class Caminhao extends  Veiculo {
     public Caminhao(String modelo) {


         super(modelo);
     }

     @Override
     public void realizarManutencao() {
         System.out.println("Verificação dos freios realizada para o caminhão" + getModelo());
     }
 }
