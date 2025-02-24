package org.example.Exercicios.ExemplosHeranca;

class Animal {
    protected String tipo = "Mamifero";

}
class Cachorro extends Animal{
    void mostrarTipo(){
        System.out.println("Tipo:" + tipo);

    }
}
class animal {
    void emitirSom(){
        System.out.println("Som generico");
    }
}
class cachorro extends animal {
    @Override
    void emitirSom() {
        System.out.println("Latido!");
    }
}
