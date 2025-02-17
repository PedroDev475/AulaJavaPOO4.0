package org.example.Exercicios.Exemplos;

public class Empresa {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("joão",3000);
        Gerente g1 = new Gerente("Carlos",5000,1500);

        f1.exibirDados();
        g1.exibirDados();
    }
}
