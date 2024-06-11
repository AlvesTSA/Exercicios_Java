package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollar_price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double value = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f",CurrencyConverter.calcConverter(value, dollar_price));
        sc.close();
    }
}
