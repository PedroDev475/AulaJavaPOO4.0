package org.example.Exercicios.ExerciciosHeranca.ExemplosAbstracao.animal.AparelhoEletronico.SensorCardiaco.Gerenciamento_de_Funcionarios.Sistema_Controlador_de_Equipamentos;

public interface AparelhoInteligente {
    int NIVEL_MAXIMO = 100;

    void ligar();

    void desligar();

    default int ajustarNivel(int nivelAtual, int ajuste) {
      if(validarNivel(nivelAtual,ajuste)) {
          return nivelAtual + ajuste;
      }else{
          return nivelAtual;
      }
    }



    private boolean validarNivel(int nivel, int ajuste) {
        return (nivel>=0) &&
                (nivel<=NIVEL_MAXIMO) &&
                (nivel+ajuste!= -1) &&
                (nivel+ajuste != 101);
    }
    static void mensagemBemVindo(){
        System.out.println(" Bem-Vindo ao controle remoto inteligente ");
    }
}


