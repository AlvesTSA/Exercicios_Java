/*2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.*/

import java.util.Scanner;

public class exercicio_002 {
    
    public static void main(String[] args) {
        
        int vetor[] = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 numeros: ");

        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = scanner.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
