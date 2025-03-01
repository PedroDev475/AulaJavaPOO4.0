package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class ProdutoServico extends Produto{
    private static final double IMPOSTO_SERVICO = 0.05;

    public ProdutoServico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * (1 + IMPOSTO_SERVICO);
    }
}
