package org.example.Exercicios.ExemplosPolimorfismo;

class Pagamento {
    private String nome;

    public Pagamento(String nome){
        this.nome = nome;
    }
    public double calcularPagamento(){
        return 0.0; // Metodo generico,cada tipo de pagamento implementara o seu.
    }
    public String getNome(){
        return nome;
    }
}
