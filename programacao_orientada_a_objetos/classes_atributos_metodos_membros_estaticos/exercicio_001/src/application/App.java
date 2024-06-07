package application;

import java.util.Scanner;

import entities.Triangulo;

public class App {
    public static void main(String[] args) {
        Triangulo x, y;
        Scanner sc = new Scanner(System.in);

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Informe os lados do triangulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Informe os lados do triangulo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A área do triangulo x: %.2f\n", areaX);
        System.out.printf("A área do triangulo y: %.2f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: triangulo X");
        } else {
            System.out.println("Maior área: triangulo Y");
        }

        sc.close();
    }
}
