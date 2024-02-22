/*4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.*/

import java.util.Scanner;

public class exercicio_004 {
    
    public static void main(String[] args){

        char[] vetor = new char[10];
        int consoante = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 caracteres: ");

        for (int i = 0; i < vetor.length; i++) {
            
            String entrada = scanner.next();  
            vetor[i] = entrada.charAt(0);

            if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u' && vetor[i] != 'A' && vetor[i] != 'E' && vetor[i] != 'I' && vetor[i] != 'O' && vetor[i] != 'U'){

                consoante++;
            }
        }

        System.out.println("Consoantes identificadas: " + consoante);

        for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u' && vetor[i] != 'A' && vetor[i] != 'E' && vetor[i] != 'I' && vetor[i] != 'O' && vetor[i] != 'U'){

                System.out.print(vetor[i] + " ");
            }
        }

        scanner.close();
    }
}
