//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio");

        double r = scanner.nextDouble();

        double area = 3.14*(r*r);

        System.out.println("A área do circulo é:" + area);

        scanner.close();
    }
}
