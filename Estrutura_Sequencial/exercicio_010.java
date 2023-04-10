//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. F = 1.8*C + 32

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em grau Celsius: ");

        double C = scanner.nextDouble();

        double F = (1.8*C) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + F +"°");

        scanner.close();

    }
}
