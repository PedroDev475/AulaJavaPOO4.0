package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

public class SistemaCheckin implements CheckIn {


    @Override
    public void validarDocumento(CheckIn passageiro) {

    }

    @Override
    public void validarDocumentos(Passageiro passageiro) {
        if (passageiro.getDocumento().isEmpty()) {
            System.out.println("Documento invalido");
        } else {
            System.out.println("Documento valido");


        }
    }

    @Override
    public void emitircartaoEmbarque(CheckIn passageiro) {
        System.out.println("Emitir cartão de Embarque para " + passageiro.getNome());

    }

    @Override
    public void ExibirMensagemSeguranca() {
        System.out.println("Check-in seguro realizado pela Fly segure");

    }

    @Override
    public String getNome() {
        return "";
    }
}



