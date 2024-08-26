package application;

import entities.Livro;

public class App {
    public static void main(String[] args) {

        Livro livro = new Livro();

        System.out.println(livro);
        livro.emprestar();
        livro.devolver();
    }
}
