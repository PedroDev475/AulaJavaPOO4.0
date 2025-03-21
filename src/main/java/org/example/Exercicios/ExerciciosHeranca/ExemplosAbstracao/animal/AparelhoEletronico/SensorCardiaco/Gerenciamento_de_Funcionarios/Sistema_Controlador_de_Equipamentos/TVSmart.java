package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.Gerenciamento_de_Funcionarios.Sistema_Controlador_de_Equipamentos;

public class TVSmart implements  AparelhoInteligente{
    private int volume;

    public TVSmart() {
        this.volume = volume;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    public void aumentarVolume(){
        System.out.println(" Volume " + (volume = ajustarNivel(volume,1)));
    }
    public void baixarBrilho(){
        System.out.println(" Volume " + (volume = ajustarNivel(volume,-1)));
    }
}




