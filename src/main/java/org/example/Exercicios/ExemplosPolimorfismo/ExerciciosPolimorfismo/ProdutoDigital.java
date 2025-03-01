package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class ProdutoDigital extends Produto{
    private static final double IMPOSTO_DIGITAL = 0.05;

    public ProdutoDigital(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * (1 + IMPOSTO_DIGITAL);
    }
}
