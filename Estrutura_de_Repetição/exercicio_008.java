/*8. Faça um programa que leia 5 números e informe a soma e a média dos números. */

import java.util.Scanner;

public class exercicio_008 {
    
    public static void main(String[] args){

        int num = 0;
        int soma = 0;
        double media = 0;
        int i  = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 5 numeros: ");

        for(i = 0; i < 5; i++){

            num = scanner.nextInt();

            soma += num;
        }

        media = soma/i;

        System.out.println("Soma: " + soma + "\nMedia: " + media);

        scanner.close();

    }
}
