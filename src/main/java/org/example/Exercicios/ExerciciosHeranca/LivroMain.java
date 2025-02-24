package org.example.Exercicios.ExerciciosHeranca;

 class LivroMain {

     public static void main(String[] args) {



     livroFisico livroFisico = new livroFisico("A terra plana", "Super Xandão", 10);


     LivroDigital livroDigital = new LivroDigital("A terra é plana", "Super Xandão", 5,0);



        System.out.println("Livro Digital:");
        livroDigital.exibirDetalhes();

        System.out.println();


        System.out.println("Livro Físico:");
        System.out.println("Título: " + livroFisico.titulo);
        System.out.println("Autor: " + livroFisico.autor);
        System.out.println("Páginas: " + livroFisico.paginas);
 }
}




