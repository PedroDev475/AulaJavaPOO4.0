package org.example.Exercicios.Exercicio2;

 class PacienteParticular extends Paciente {
     private double custoConsulta;


     public PacienteParticular( String nome,int idade,double custoConsulta) {
         super(nome,idade);
         this.custoConsulta = custoConsulta;
     }
     @Override
     public double calcularCusto(){
          return  custoConsulta;

 }
     @Override
     public String toString(){
         return super .toString() + ",Custo Consulta:" + custoConsulta;
     }

 }
