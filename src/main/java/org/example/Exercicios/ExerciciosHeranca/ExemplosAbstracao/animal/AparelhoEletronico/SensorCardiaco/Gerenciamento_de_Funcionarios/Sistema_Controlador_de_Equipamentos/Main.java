package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.Gerenciamento_de_Funcionarios.Sistema_Controlador_de_Equipamentos;

public class Main {
    public static void main(String[] args) {
        testarAparelhos(new LampadaInteligente());
        testarAparelhos(new TVSmart());

    }
    public static void testarAparelhos(AparelhoInteligente aparelho){
        aparelho.ligar();
        if(aparelho instanceof  LampadaInteligente lampadaInteligente ){
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.aumentarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
            lampadaInteligente.baixarBrilho();
        }else if (aparelho instanceof  TVSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.aumentarVolume();
            tvSmart.baixarBrilho();
            tvSmart.baixarBrilho();
            tvSmart.baixarBrilho();
        }
    }
}
