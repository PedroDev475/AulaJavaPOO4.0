package org.example.Exercicios;

public class Alimento {
    public Alimento(String leite, double v, int i, String s) {
    }

    public String getNome() {
        return "";
    }

    public String getDataValidade() {
        return "";
    }

    public class alimento extends Produto {
        private String dataValidade;

        // Construtor
        public alimento(String nome, double preco, int quantidade, String dataValidade) {
            super(nome, preco, quantidade);
            this.dataValidade = dataValidade;
        }

        // Getter para data de validade
        public String getDataValidade() {
            return dataValidade;
        }
    }

    private class Produto {
        public Produto(String nome, double preco, int quantidade) {
        }
    }
}
