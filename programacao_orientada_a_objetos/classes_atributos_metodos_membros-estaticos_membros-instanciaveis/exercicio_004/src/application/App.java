package application;

import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salário Bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Funcionário: " + employee);
        System.out.print("Qual porcentagem para aumentar o salário? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Dados atualizados: " + employee);

        sc.close();
    }
}
