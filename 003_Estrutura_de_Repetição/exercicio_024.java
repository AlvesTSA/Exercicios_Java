/*24. Faça um programa que calcule o mostre a média aritmética de N notas. */

import java.util.Scanner;

public class exercicio_024 {
    
    public static void main(String[] args){

        int n = 0;
        float nota = 0;
        float soma = 0;
        float media = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantas notas deseja calcular: ");
        n = scanner.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.println("Informe a nota " + i + ":");
            nota = scanner.nextFloat();

            soma += nota;
        }
        media = soma/n;

        System.out.println("Nota media: " + media);

        scanner.close();
    }
}
