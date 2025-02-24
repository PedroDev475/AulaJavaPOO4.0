package org.example.Exercicios.ExemplosPolimorfismo;

 class Moto  extends Veiculo{
     public Moto (String modelo){
         super (modelo);
     }

     @Override
     public void realizarManutencao() {
         System.out.println("Troca de oleo realizada para a moto " + getModelo());
     }
 }
