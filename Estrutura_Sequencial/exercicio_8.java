//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos você ganha por hora ? :");

        float ganho_hora = scanner.nextFloat();

        System.out.println("Quantas horas você trabalhou no mês ? :");

        float hora_mes = scanner.nextFloat();

        float salario_mes = ganho_hora*hora_mes;

        System.out.println("Seu salário é: " + salario_mes);

        scanner.close();

    }
}
