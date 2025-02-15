package org.example.Exercicios.Exercicio2;

public class Pedidos {
    public static void main(String[] args) {
        PedidoOnline pedidoOnline = new PedidoOnline(123, 100, 10);
        PedidoPresencial pedidoPresencial = new PedidoPresencial(456, 200, true, 10);

        System.out.println("Valor total do pedido online: " + pedidoOnline.getValorTotalComEntrega());
        System.out.println("Valor total do pedido presencial: " + pedidoPresencial.getValorTotalComDesconto());
    }
}


