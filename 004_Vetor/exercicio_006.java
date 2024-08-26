/*6. Leia um vetor de 40 posições e atribua valor 0 para todos os elementos que possuírem valores negativos.*/

import java.util.Scanner;

public class exercicio_006 {
    
    public static void main(String[] args){

        int[] vetor = new int[40];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 40 numeros inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = scanner.nextInt();

            if (vetor[i] < 0) {
                
                vetor[i] = 0;
            }
        }

        System.out.println("valores inseridos maiores que zero:");

        for (int i = 0; i < vetor.length; i++) {
            
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
