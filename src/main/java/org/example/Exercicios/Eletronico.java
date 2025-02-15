package org.example.Exercicios;

public class Eletronico {
    public Eletronico(String smartphone, int i, int i1, double v) {
    }

    public String getNome() {
        return "";
    }

    public String getVoltagem() {
        return "";
    }

    public class eletronico extends Produto {
        private double voltagem;

        // Construtor
        public eletronico(String nome, double preco, int quantidade, double voltagem) {
            super(nome, preco, quantidade);
            this.voltagem = voltagem;
        }

        // Getter para voltagem
        public double getVoltagem() {
            return voltagem;
        }
    }

    private class Produto {
        public Produto(String nome, double preco, int quantidade) {
        }
    }
}
