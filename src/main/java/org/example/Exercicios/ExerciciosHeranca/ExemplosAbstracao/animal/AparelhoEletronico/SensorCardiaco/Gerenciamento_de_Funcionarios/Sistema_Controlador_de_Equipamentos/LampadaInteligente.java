package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.Gerenciamento_de_Funcionarios.Sistema_Controlador_de_Equipamentos;

public class LampadaInteligente  implements  AparelhoInteligente{
    private int brilho;

    public LampadaInteligente() {
        this.brilho = brilho;
    }

    @Override
    public void ligar() {
        System.out.println(" Ligar Lampada ");


    }

    @Override
    public void desligar() {
        System.out.println(" Desligar Lampada ");

    }

    public void aumentarBrilho(){
        System.out.println(" Brilho " + (brilho = ajustarNivel(brilho,1)));
    }
    public void baixarBrilho(){
        System.out.println(" Brilho " + (brilho = ajustarNivel(brilho,-1)));
    }
}
