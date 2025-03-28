package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

public interface CheckIn {
    void validarDocumento(CheckIn passageiro);

    void validarDocumentos(Passageiro passageiro);

    void emitircartaoEmbarque(CheckIn passageiro);
    void ExibirMensagemSeguranca();


    String getNome();
}
