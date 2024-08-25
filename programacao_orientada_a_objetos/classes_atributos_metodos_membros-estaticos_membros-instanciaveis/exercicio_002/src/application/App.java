package application;

import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product produtc = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        produtc.name = sc.nextLine();
        System.out.print("Price: ");
        produtc.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        produtc.quantity = sc.nextInt();
        System.out.println("Product data: " + produtc);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        produtc.addProducts(add);

        System.out.println("Update data: " + produtc);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        produtc.removeProducts(remove);

        System.out.println("Update data: " + produtc);
        System.out.println();

        sc.close();
    }
}
