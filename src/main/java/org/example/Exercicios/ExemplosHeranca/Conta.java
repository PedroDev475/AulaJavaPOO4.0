package org.example.Exercicios.ExemplosHeranca;

public class Conta {
    private String titular;
     double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        saldo+= valor;
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
    } else {
            System.out.println("Saldo Insuficiente.");
        }

    }
    public void exibirSaldo(){
        System.out.println("Titular:" + titular + "Saldo: R$"+ saldo);
    }
}
