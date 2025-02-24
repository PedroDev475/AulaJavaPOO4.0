package org.example.Exercicios.ExerciciosHeranca;

public class Paciente {
    private String nome;
    private int idade;
    private int desconto;
    private double custo;

    public Paciente(String nome,int idade ) {
        this.nome = nome;
        this.idade = idade;
        this.custo = calcularCusto();
    }
    public double calcularCusto() {
        return 500.0;
    }



    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


    public double getCusto() {
        return custo;
    }

    public int getDesconto() {
        return desconto;
    }

   @Override
    public String toString(){
        return "Nome:" + nome + ", Idade:" + idade + ",custo " + custo;
    }
}
