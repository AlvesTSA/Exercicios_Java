/*. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. */

import java.util.Scanner;

public class exercicio_016 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a área a ser pintada: ");
        double area = scanner.nextDouble();

        double litros_necessario = area/3;
        double lata = litros_necessario/18;
        double valor = lata*80;

        System.out.println("Latas necessárias: " + lata);
        System.out.println("Valor R$: " + valor);

        scanner.close();

    }
}
