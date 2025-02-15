package org.example.Exercicios;


    public class Main {
        public static void main(String[] args) {
            Alimento leite = new Alimento("Leite", 3.50, 10, "15/05/2024");
            Eletronico celular = new Eletronico("Smartphone", 1500, 5, 5.0);

            System.out.println("Nome do produto: " + leite.getNome());
            System.out.println("Data de validade: " + leite.getDataValidade());

            System.out.println("Nome do produto: " + celular.getNome());
            System.out.println("Voltagem: " + celular.getVoltagem());
        }
    }






