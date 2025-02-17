package org.example.Exercicios.Exercicio2;

public class PacienteCovenio  extends Paciente {
    private int desconto;

    public PacienteCovenio(String nome, int idade, int desconto) {
        super(nome, idade);
        this.desconto = desconto;
    }

    @Override
    public double calcularCusto() {
        return super.getCusto() * (1 - (desconto / 100.0));  //
    }

    @Override
    public String toString() {
        return super.toString() + ", Desconto: " + desconto + "%";
    }
}





