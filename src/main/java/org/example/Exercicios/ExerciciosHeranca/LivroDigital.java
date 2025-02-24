package org.example.Exercicios.ExerciciosHeranca;

 class LivroDigital extends livros {

     private int tamamhoArquivo;



     public LivroDigital(String titulo, String autor, int tamamhoArquivo, int i) {
         super(titulo, autor);
         this.tamamhoArquivo = tamamhoArquivo;
     }




     public void exibirDetalhes(){
         System.out.println("Titulo: " + this.titulo);
         System.out.println("Autor: " + this.autor);
         System.out.println("Tamanho Arquivo:" + this.tamanhoArquivoMB + "MB");
     }
 }











