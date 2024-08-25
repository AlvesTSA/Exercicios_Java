package application;

import java.util.Scanner;
import entities.ContaBancaria;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Informe o número da conta: ");
        conta.numero_conta = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe o nome do titular: ");
        conta.nome_titular = sc.nextLine();
        System.out.print("Informe o saldo inicial: ");
        conta.saldo = sc.nextFloat();
        System.out.println(conta);
        System.out.println();

        System.out.print("Informe o valor a ser depositado: ");
        float valor = sc.nextFloat();
        conta.depositar(valor);

        System.out.print("Informe o valor a ser sacado: ");
        valor = sc.nextFloat();
        conta.sacar(valor);

        float saldo = conta.consultar_saldo();
        System.out.printf("Saldo atual: %.2f\n\n",saldo);

        System.out.print("Informe o valor a ser sacado: ");
        valor = sc.nextFloat();
        conta.sacar(valor);
        sc.close();
    }
}
