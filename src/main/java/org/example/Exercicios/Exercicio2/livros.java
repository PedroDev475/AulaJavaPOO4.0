package org.example.Exercicios.Exercicio2;

 class livros {
    String titulo;
    String autor;
    int tamanhoArquivoMB;

     public livros(int tamanhoArquivoMB) {
         this.tamanhoArquivoMB = tamanhoArquivoMB;
     }

     public livros(String titulo, String autor) {
         this.titulo = titulo;
         this.autor = autor;
     }

     public livros(String autor) {

     }

     public livros() {

     }

     public int getTamanhoArquivoMB() {
         return tamanhoArquivoMB;
     }

     public String getTitulo() {
         return titulo;
     }

     public String getAutor() {
         return autor;
     }

     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }

     public void setAutor(String autor) {
         this.autor = autor;
     }

     public void setTamanhoArquivoMB(int tamanhoArquivoMB) {
         this.tamanhoArquivoMB = tamanhoArquivoMB;
     }

     void exibirDetalhes() {
         System.out.println("Titulo:" + titulo + "autor:"+ autor  + "tamanhoarquivoMB:" + tamanhoArquivoMB);
     }

 }

