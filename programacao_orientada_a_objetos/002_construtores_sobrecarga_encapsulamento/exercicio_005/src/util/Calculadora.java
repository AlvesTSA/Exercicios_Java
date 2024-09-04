package util;

public class Calculadora {

    private double resultado;

    public int soma(int a, int b){

        System.out.println("Soma de dois inteiros: ");
        System.out.println("Entrada: " + a + ", " + b);
        int soma = a + b;
        this.resultado = soma;
        return soma;
    }

    public int soma(int a, int b, int c){

        System.out.println("Soma de três inteiros: ");
        System.out.println("Entrada: " + a + ", " + b + ", " + c);
        int soma = a + b + c;
        this.resultado = soma;
        return soma;
    }

    public double soma(double a, double b){

        System.out.println("Soma de dois doubles: ");
        System.out.println("Entrada: " + a + ", " + b);
        double soma = a + b;
        this.resultado = soma;
        return soma;
    }

    public double getResultado(){

        return this.resultado;
    }
    
}
