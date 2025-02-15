package org.example.Exercicios;

public class Exercicio1 {
    public class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        // Construtor
        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        // Getters
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }
    }

    public class Alimento extends Produto {
        private String dataValidade;

        // Construtor
        public Alimento(String nome, double preco, int quantidade, String dataValidade) {
            super(nome, preco, quantidade);
            this.dataValidade = dataValidade;
        }

        // Getter para data de validade
        public String getDataValidade() {
            return dataValidade;
        }
    }

    public class Eletronico extends Produto {
        private double voltagem;

        // Construtor
        public Eletronico(String nome, double preco, int quantidade, double voltagem) {
            super(nome, preco, quantidade);
            this.voltagem = voltagem;
        }

        // Getter para voltagem
        public double getVoltagem() {
            return voltagem;
        }
        }
    }
