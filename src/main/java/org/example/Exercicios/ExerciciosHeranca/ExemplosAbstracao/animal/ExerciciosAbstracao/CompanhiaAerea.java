package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.ExerciciosAbstracao;

abstract class CompanhiaAerea {
    public static final int PESO_MAX_BAGAGEM_NACIONAL = 10;  // kg para voos nacionais
    public static final int PESO_MAX_BAGAGEM_INTERNACIONAL = 20;

    public static void mensagemBemVindo() {
        System.out.println("Bem-vindo ao FlySecure! O seu check-in está sendo realizado com segurança.");
    }


    public abstract boolean validarDocumento(String documento);


    public abstract void emitirCartaoEmbarque(String passageiro);


    private boolean validarPassaporte(String passaporte) {
        return passaporte.length() == 9;
    }


    private boolean validarRG(String rg) {
        return rg.length() == 7;  // Exemplo: tamanho fixo de 7 caracteres
    }


    public boolean validarBagagem(int peso, boolean vooInternacional) {
        int pesoMax = vooInternacional ? PESO_MAX_BAGAGEM_INTERNACIONAL : PESO_MAX_BAGAGEM_NACIONAL;
        if (peso <= pesoMax) {
            System.out.println("Bagagem dentro do limite de peso (" + pesoMax + " kg).");
            return true;
        } else {
            System.out.println("Bagagem excede o limite de peso (" + pesoMax + " kg).");
            return false;
        }
    }
}

