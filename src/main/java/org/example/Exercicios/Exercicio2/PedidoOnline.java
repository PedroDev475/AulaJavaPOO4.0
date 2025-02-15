package org.example.Exercicios.Exercicio2;

    public class PedidoOnline extends Pedido {
        private double taxaEntrega;

        public PedidoOnline(int numeroPedido, double valorTotal, double taxaEntrega) {
            super(numeroPedido, valorTotal);
            this.taxaEntrega = taxaEntrega;
        }

        public double getTaxaEntrega() {
            return taxaEntrega;
        }

        public void setTaxaEntrega(double taxaEntrega) {
            this.taxaEntrega = taxaEntrega;
        }

        public double getValorTotalComEntrega() {
            double valorTotal = 0;
            return valorTotal + taxaEntrega;
        }
    }





