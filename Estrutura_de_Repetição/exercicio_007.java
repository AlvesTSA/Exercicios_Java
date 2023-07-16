/*7. Faça um programa que leia 5 números e informe o maior número. */

import java.util.Scanner;

public class exercicio_007 {
    
    public static void main(String[] args){

        int maior = 0;
        int num = 0;
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("INforme 5 numeros: ");
        maior = scanner.nextInt();

        for(i = 0; i < 4; i++){

            num = scanner.nextInt();

            if (num > maior) {
                
                maior = num;
            }
        }

        System.out.println("Maior: " + maior);

        scanner.close();
    }
}
