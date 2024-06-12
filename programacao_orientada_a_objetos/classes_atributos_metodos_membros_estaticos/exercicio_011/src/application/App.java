package application;

import java.util.Scanner;

import entities.Venda;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Venda venda = new Venda();

        System.out.print("Venda: ");
        venda.codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Data: ");
        venda.data = sc.nextLine();
        System.out.print("Valor Total: ");
        venda.valor_total = sc.nextFloat();

        System.out.println(venda);
        System.out.println();

        venda.registrar_pagamento();
        venda.cancelar_venda();

        sc.close();
    }
}
