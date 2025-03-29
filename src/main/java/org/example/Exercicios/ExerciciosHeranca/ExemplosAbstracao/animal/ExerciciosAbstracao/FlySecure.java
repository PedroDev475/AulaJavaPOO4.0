package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

class FlySecure extends CompanhiaAerea {

    @Override
    public boolean validarDocumento(String documento) {

        if (documento.matches("\\d{11}")) {
            System.out.println("Documento válido!");
            return true;
        } else {
            System.out.println("Documento inválido!");
            return false;
        }
    }

    @Override
    public void emitirCartaoEmbarque(String passageiro) {

        System.out.println("Cartão de embarque emitido para " + passageiro + ". Tenha um bom voo!");
    }
}



