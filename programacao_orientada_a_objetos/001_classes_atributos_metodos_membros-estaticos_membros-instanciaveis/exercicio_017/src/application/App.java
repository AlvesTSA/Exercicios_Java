package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.Pedido;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Pedido pedido1 = new Pedido();
        System.out.print("Pedido: ");
        pedido1.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data_a = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        pedido1.data = LocalDate.parse(data_a,formatter);
        System.out.println("Status: " + (pedido1.pago ? "Pago" : "Nao Pago"));
        System.out.println();
        pedido1.registrar_pagamento();
        System.out.println("Status: " + (pedido1.pago ? "Pago" : "Nao Pago"));
        System.out.println("Total de pedidos: " + Pedido.total_pedidos);
        System.out.println();
        pedido1.cancelar_pedido();
        
        sc.close();
    }
}
