package org.example.Exercicios.ExemplosPolimorfismo;
//Funcionario CLT recebe salario fixo
 class CLT extends  Pagamento {
     private double salario;

     public CLT(String nome, double salario) {
         super(nome);
         this.salario = salario;
     }

     @Override
     public double calcularPagamento() {
         return salario;
     }
 }
