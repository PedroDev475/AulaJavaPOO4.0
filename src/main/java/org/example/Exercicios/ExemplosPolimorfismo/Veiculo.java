package org.example.Exercicios.ExemplosPolimorfismo;

public class Veiculo {
    private String modelo;

    public Veiculo(String veiculo) {
        this.modelo = veiculo;
    }
    public void realizarManutencao(){
        System.out.println("Manutenção generica");
       // Metodo polimorfico
    }
    public String getModelo(){
        return modelo;
    }
}
