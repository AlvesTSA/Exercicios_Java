package application;

import java.util.Scanner;

import entities.QuartoHotel;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QuartoHotel qh = new QuartoHotel();

        System.out.print("Quarto: ");
        qh.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo: ");
        qh.tipo = sc.nextLine();
        System.out.print("Preço por noite: ");
        qh.preco_noite = sc.nextFloat();

        System.out.println(qh);

        qh.reservar();
        qh.liberar();
        

        sc.close();
    }
}
