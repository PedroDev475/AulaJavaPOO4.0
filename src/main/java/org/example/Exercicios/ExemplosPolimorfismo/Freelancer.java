package org.example.Exercicios.ExemplosPolimorfismo;
// Freelancer recebe por projeto
 class Freelancer  extends Pagamento {
    private double valorProjeto;

    public Freelancer(String nome, double valorProjeto) {
        super(nome);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularPagamento() {
        return valorProjeto;
    }
}


