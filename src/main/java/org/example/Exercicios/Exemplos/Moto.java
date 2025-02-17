package org.example.Exercicios.Exemplos;

 class Moto extends  Veiculo{
     boolean temPartidaEletrica;

     public Moto(String marca, int ano, boolean temPartidaEletrica) {
         super(marca, ano);
         this.temPartidaEletrica = temPartidaEletrica;
     }

     void exibirDetalhes(){
         super.exibirDetalhes();
         System.out.println("Partida Eletrica:"+ (temPartidaEletrica? "Sim": "Não"));
     }
 }
