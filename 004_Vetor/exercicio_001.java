/*1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.*/

import java.util.Scanner;

public class exercicio_001 {

    public static void main(String[] args) {
        
        int[] num = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 5 numeros inteiros: ");
        
        for(int i = 0; i < 5; i++){

            num[i] = scanner.nextInt();
        }

        for(int i = 0; i < 5; i++){

            System.out.print(num[i] + " ");
        }

        scanner.close();
    }
}


