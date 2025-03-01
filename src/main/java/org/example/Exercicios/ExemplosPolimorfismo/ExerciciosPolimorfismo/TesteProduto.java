package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produtoFisico = new ProdutoFisico("Livro", 50.0);
        ProdutoDigital produtoDigital = new ProdutoDigital("E-book", 25.0);
        ProdutoServico produtoServico = new ProdutoServico("Consultoria", 200.0);

        System.out.println("Preço final do produto físico: R$" + produtoFisico.calcularPrecoFinal());
        System.out.println("Preço final do produto digital: R$" + produtoDigital.calcularPrecoFinal());
        System.out.println("Preço final do serviço: R$" + produtoServico.calcularPrecoFinal());
    }
}


