/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a)o produto do dobro do primeiro com metade do segundo .
b)a soma do triplo do primeiro com o terceiro.
c)o terceiro elevado ao cubo.        */

import java.util.Scanner;

public class exercicio_011{

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.println("Informe o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.println("Informe o terceiro número: ");
        float num3 = scanner.nextFloat();

        float produto = 2*num1*(num2/2);
        float soma = 3*num1 + num3;
        float cubo = num3*num3*num3;

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + produto);
        System.out.println("a soma do triplo do primeiro com o terceiro: " + soma);
        System.out.println("O terceiro elevado ao cubo: " + cubo);

        scanner.close();
        

    }
}
