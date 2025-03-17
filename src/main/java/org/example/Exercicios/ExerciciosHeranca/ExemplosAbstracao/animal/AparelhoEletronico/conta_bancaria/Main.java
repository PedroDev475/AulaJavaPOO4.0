package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.conta_bancaria;

public class Main {
    public static void main(String[] args) {


         infoContas (new ContaCorrente("Pedro",1000));
         infoContas(new ContaPoupanca("Vitor",100));



        System.out.println("------teste CC-------");
    }
   public  static void infoContas(Conta conta){
       System.out.println("Saldo antes: ");
       conta.consultarSaldo();

       conta.aplicarTaxaMensal();

       System.out.println("Saldo depois");
       conta.consultarSaldo();
       System.out.println();
   }
}


