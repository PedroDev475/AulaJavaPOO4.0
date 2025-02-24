package org.example.Exercicios.ExemplosHeranca;

class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

   @Override
    public void exibirDados(){
       System.out.println("Nome:" + getNome() + ", Salario Total: R$" + (getSalario()+ bonus));

    }

}






