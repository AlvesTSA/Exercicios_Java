package application;

import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.heigth = sc.nextDouble();

        System.out.println(rectangle);
       
        sc.close();
    }
}
