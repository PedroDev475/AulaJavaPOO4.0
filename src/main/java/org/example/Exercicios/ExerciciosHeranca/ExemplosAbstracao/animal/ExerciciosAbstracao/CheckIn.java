package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

public class CheckIn {
    public static void realizarCheckIn(CompanhiaAerea companhia, String documento, int pesoBagagem, boolean vooInternacional) {
        CompanhiaAerea.mensagemBemVindo();
        if (companhia.validarDocumento(documento)) {

            if (companhia.validarBagagem(pesoBagagem, vooInternacional)) {

                companhia.emitirCartaoEmbarque("João Silva");
            } else {
                System.out.println("Bagagem inválida.");
            }
        } else {
            System.out.println("Não foi possível realizar o check-in devido a documento inválido.");
        }
    }
    }

