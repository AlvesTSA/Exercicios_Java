import java.util.Scanner;

import entities.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Carro 1: ");
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        sc.nextLine();
        Carro c1 = new Carro(marca, modelo, ano);
        System.out.println();
        System.out.println("Carro 2: ");
        System.out.print("Marca: ");
        marca = sc.nextLine();
        System.out.print("Modelo: ");
        modelo = sc.nextLine();
        Carro c2 = new Carro(marca, modelo);
        System.out.println();
        System.out.println("Dados dos Carros:");
        System.out.println("Carro 1: " + c1);
        System.out.println("Carro 2: " + c2);
        System.out.println();
        sc.close();
    }
}
