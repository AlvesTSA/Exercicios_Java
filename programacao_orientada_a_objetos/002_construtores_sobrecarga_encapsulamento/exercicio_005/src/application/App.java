package application;

import util.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {

        Calculadora calc1 = new Calculadora();
        System.out.println();
        System.out.println("Resultado: " + calc1.soma(5, 10));
        System.out.println();
        System.out.println("Resultado: " + calc1.soma(2, 3,4));
        System.out.println();
        System.out.println("Resultado: " + calc1.soma(2.0, 3.0));
        System.out.println();
        System.out.println("Resultado: " + calc1.soma(5, 50));
        System.out.println();
        System.out.println("Resultado armazenado: "+ calc1.getResultado());
        System.out.println();
        
    }
}
