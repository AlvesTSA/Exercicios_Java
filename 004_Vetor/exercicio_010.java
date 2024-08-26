/*10. Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.*/

import java.util.Scanner;

public class exercicio_010 {
    
    public static void main(String[] args){

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o vetor a: ");

        for (int i = 0; i < a.length; i++) {
            
            a[i] = scanner.nextInt();
            
        }

        System.out.println("Informe o vetor b: ");

        for (int i = 0; i < b.length; i++) {
            
            b[i] = scanner.nextInt();
        }

        int y = 0;
        int z = 0;

        for (int i = 0; i < c.length; i += 2) {
            
            c[i] = a[y];
            y++;
        }
        for (int i = 1; i < c.length; i += 2) {
            
            c[i] = b[z];
            z++;
        }

        System.out.print("Vetor C: ");

        for (int i = 0; i < c.length; i++) {
            
            System.out.print(c[i] + " ");
        }

        scanner.close();
    }
}
