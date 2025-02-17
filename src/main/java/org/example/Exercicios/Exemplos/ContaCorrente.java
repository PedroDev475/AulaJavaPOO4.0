package org.example.Exercicios.Exemplos;

class ContaCorrente extends  Conta {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }
    @Override
    public void sacar(double valor){
        if (valor <= ( super.saldo + limite)) {
            super.saldo -= valor;
        }else{
            System.out.println("Saldo limite insuficiente.");
        }
    }
}
