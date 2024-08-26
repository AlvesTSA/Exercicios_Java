/*9. Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.*/

import java.util.Scanner;

public class exercicio_009 {
    
    public static void main(String[] args){

        int[] vetor = new int[10];
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 numeros interos: ");

        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = scanner.nextInt();
            soma += (vetor[i]*vetor[i]);
        }

        System.out.println("Soma dos quadrados: " + soma);

        scanner.close();
    }
}
