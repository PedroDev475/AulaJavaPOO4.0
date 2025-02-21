package org.example.Exercicios.Exercicio2;

   class livroFisico extends livros   {
  int paginas;

       public livroFisico(String titulo, String autor, int paginas) {
           super(titulo, autor);
           this.paginas = paginas;
       }

       public livroFisico(String titulo) {
           super();
       }




       void exibirDetalhes(){
       super.exibirDetalhes();
           System.out.println("paginas:" + paginas);
       }
   }





