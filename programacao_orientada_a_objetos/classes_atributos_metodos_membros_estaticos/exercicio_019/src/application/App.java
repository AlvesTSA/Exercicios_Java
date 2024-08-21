package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.Compra;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Compra compra1 = new Compra();

        System.out.print("Compra: ");
        compra1.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data  (dd/MM/yyyy): ");
        String data = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        compra1.data = LocalDate.parse(data, formatter);
        System.out.print("Valor total: ");
        compra1.valor_total = sc.nextFloat();
        System.out.println("Status: " + (compra1.entregue ? "Entregue" : "Nao Entregue"));
        System.out.println();
        compra1.registrar_entrega();
        System.out.println("Status: " + (compra1.entregue ? "Entregue" : "Nao Entregue"));
        System.out.println("Total de compras: " + Compra.total_compras);
        System.out.println();
        compra1.cancelar_compra();
        sc.close();
    }
}
