package org.example.Exercicios.ExemplosPolimorfismo;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",2000,1);
        Produto p2 = new Produto("SmartPhone",2000.00,2);
        Produto p3 = new Produto("Monitor",1500.00,2);

       p1.mostrarDetalhes();
       p2.mostrarDetalhes();
       p3.mostrarDetalhes();
    }
}
