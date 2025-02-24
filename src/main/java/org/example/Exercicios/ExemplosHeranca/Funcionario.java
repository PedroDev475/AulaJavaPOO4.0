package org.example.Exercicios.ExemplosHeranca;

public class Funcionario {
    private String nome;
    private  double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirDados(){
        System.out.println("nome:" + nome + "salario: R$"+ salario);


    }
}
