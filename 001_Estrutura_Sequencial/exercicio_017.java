/* Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 2 situações:

a) comprar apenas latas de 18 litros;

b) comprar apenas galões de 3,6 litros. */

import java.util.Scanner;

public class exercicio_017{

    public static void main(String [] args){

        double area = 0;
        double quant_necessaria = 0;
        double galao = 0;
        double lata = 0;
        double custo_galao = 0;
        double custo_lata = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a área a se pintada]: ");
        area = scanner.nextDouble();

        quant_necessaria = area/6;
        lata = quant_necessaria/18;
        galao = quant_necessaria/3.6;
        custo_lata = lata*80;
        custo_galao = galao*25;

        System.out.println("Quantidade de lata: " + lata);
        System.out.println("Quantidade de galão: " + galao);
        System.out.println("Valor em latas R$: " + custo_lata);
        System.out.println("Valor em galões R$: " + custo_galao);

        scanner.close();

    }
}