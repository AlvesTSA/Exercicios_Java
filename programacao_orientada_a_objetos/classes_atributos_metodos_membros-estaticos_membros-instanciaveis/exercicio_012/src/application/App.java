package application;

import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Funcionario fun = new Funcionario();

        System.out.print("Funcionário: ");
        fun.matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome:: ");
        fun.nome = sc.nextLine();
        System.out.print("Cargo:: ");
        fun.cargo = sc.nextLine();
        System.out.println("Horas Trabalhadas: 0");

        fun.registrar_entrada(8);
        System.out.println("\n");
        fun.registrar_saida(5);
        sc.close();
    }
}
