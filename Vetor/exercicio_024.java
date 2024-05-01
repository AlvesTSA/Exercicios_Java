/*24. Leia um vetor de 5 posições contendo os caracteres de um numero. Em seguida escreva esse numero por extenso.*/

import java.util.Scanner;

public class exercicio_024 {
    
    public static void main(String[] args){

        int[] vetor = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            
            System.out.print("Informe o carctere " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();

        } 

        System.out.print("Numero: ");

        for (int i = 0; i < 5; i++){
            
            System.out.print(vetor[i]);
        }

        scanner.close();
    }
}