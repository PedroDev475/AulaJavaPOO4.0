package org.example.Exercicios.ExemplosPolimorfismo;

public class TestePagamento {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new CLT ("Marcos",500),
                new PJ ("Julia",160,50),
                new Freelancer("Roberto",4000)
        };
        for (Pagamento p : pagamentos){
            System.out.println(p.getNome() + "recebe R$" + p.calcularPagamento());
        }
    }
}
