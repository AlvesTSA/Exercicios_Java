/* Faça um Programa que peça um número inteiro e determine se ele e par ou ímpar.*/

import java.util.Scanner;

class exercicio_018{

    public static void main(String[] args){

        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        num = scanner.nextInt();

        if (num % 2 == 0){

            System.out.println("Número par");
        }
        else{

           System.out.println("Número impar");
        }

        scanner.close();

    }
}