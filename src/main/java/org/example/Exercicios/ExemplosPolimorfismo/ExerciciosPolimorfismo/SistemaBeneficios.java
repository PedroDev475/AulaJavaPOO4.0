package org.example.Exercicios.ExemplosPolimorfismo.ExerciciosPolimorfismo;

public class SistemaBeneficios {
    public static void main(String[] args) {
        double salario = 5000.0;



        ValeAlimentacao valeAlimentacao = new ValeAlimentacao(300.0);
        PlanoDeSaude planoDeSaude = new PlanoDeSaude(500.0);
        AuxilioTransporte auxilioTransporte = new AuxilioTransporte(200.0);

        System.out.println("Desconto Vale Alimentação: R$" + valeAlimentacao.CalcularDesconto(salario));
        System.out.println("Desconto Plano de Saúde: R$" + planoDeSaude.CalcularDesconto(salario));
        System.out.println("Desconto Auxílio Transporte: R$" + auxilioTransporte.CalcularDesconto(salario));

        double totalDescontos = valeAlimentacao.CalcularDesconto(salario) +
                planoDeSaude.CalcularDesconto(salario) +
                auxilioTransporte.CalcularDesconto(salario);

        System.out.println("Total de Descontos: R$" + totalDescontos);
        System.out.println("Salário Líquido: R$" + (salario - totalDescontos));
    }
    public static double calcularDesconto(double salario ,Beneficio...beneficios){
        double totalDescontos = 0;
        for (Beneficio beneficio : beneficios){
            totalDescontos += beneficio.CalcularDesconto(salario);
        }
        return totalDescontos;
    }
}

