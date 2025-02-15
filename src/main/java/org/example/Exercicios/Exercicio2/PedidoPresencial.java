package org.example.Exercicios.Exercicio2;

public class PedidoPresencial {
    private boolean pagamentoAVista;
    private double desconto;

    public PedidoPresencial(int numeroPedido, double valorTotal, boolean pagamentoAVista, double desconto) {
        super();
        this.pagamentoAVista = pagamentoAVista;
        this.desconto = desconto;
    }

    public boolean isPagamentoAVista() {
        return pagamentoAVista;
    }

    public void setPagamentoAVista(boolean pagamentoAVista) {
        this.pagamentoAVista = pagamentoAVista;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotalComDesconto() {
        double valorTotal = 0;
        if (pagamentoAVista) {
            return valorTotal - (valorTotal * desconto / 100);
        } else {
            return valorTotal;
        }
    }
}

