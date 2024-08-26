/*3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.*/

import java.util.Scanner;

public class exercicio_003 {
    
    public static void main(String[] args){

        float[] notas = new float[4];
        float media = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as 4 notas:");

        for (int i = 0; i < notas.length; i++) {
            
            notas[i] = scanner.nextFloat();

            media += notas[i];
        }

        media /= 4;
        
        System.out.print("Notas: ");

        for (int i = 0; i < notas.length; i++) {
            
            System.out.print(notas[i] + " ");
        }

        System.out.println("\nMedia: " + media);

        scanner.close();
    }
}
