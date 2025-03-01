package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

  public class ProdutoFisico extends Produto {
     private static final double IMPOSTO_FISICO = 0.02;

     public ProdutoFisico(String nome, double precoBase) {
         super(nome, precoBase);
     }

     @Override
     public double calcularPrecoFinal() {
         return getPrecoBase() * (1 +  IMPOSTO_FISICO);
     }
 }
