/*5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.*/

import java.util.Scanner;

public class exercicio_005 {
    
    public static void main(String[] args){

        int[] num = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 20 numeros inteiros:");

        for (int i = 0; i < 20; i++) {
            
            num[i] = scanner.nextInt();
        }
        
        int y = 0;
        int resto = 0;
        int w = 0;

        for (int i = 0; i < 20; i++) {
            
            resto = num[i] % 2;

            if (resto == 0) {
                
                par[y] = num[i];
                y++;
            }
            else{

                impar[w] = num[i];
                w++;
            }
        }
        
        System.out.print("Numeros lidos: ");

        for (int i = 0; i < num.length; i++) {
            
            System.out.print(num[i] + " ");
        }

        System.out.print("\nNumeros pares: ");

        for (int i = 0; i < y; i++) {
            
            System.out.print(par[i] + " ");
        }

        System.out.print("\nNumeros impares: ");

        for (int i = 0; i < w; i++) {
            
            System.out.print(impar[i] + " ");
        }

        scanner.close();
    }
}
