/*7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.*/

import java.util.Scanner;

public class exercicio_007 {
    
    public static void main(String[] args){

        int[] vetor = new int[5];
        int soma = 0;
        int mult = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 5 numeros inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = scanner.nextInt(); 
            soma += vetor[i];
            mult *= vetor[i]; 
        }

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicacao: " + mult);
        System.out.print("Numeros: ");

        for (int i = 0; i < vetor.length; i++) {
            
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
