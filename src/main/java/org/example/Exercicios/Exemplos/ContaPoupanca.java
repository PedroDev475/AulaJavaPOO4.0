package org.example.Exercicios.Exemplos;

 class ContaPoupanca extends Conta  {
     private double taxaRendimento;

     public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
         super(titular, saldo);
         this.taxaRendimento = taxaRendimento;
     }
     public void aplicarRendimento(){
         super.saldo += super.saldo *taxaRendimento;
     }
 }
