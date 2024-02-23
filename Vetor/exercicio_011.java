/*11. Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.*/

import java.util.Scanner;

public class exercicio_011 {
    
    public static void main(String[] args){

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int[] d = new int[30];

        Scanner scanner = new Scanner(System.in);

        int y = 0;

        System.out.println("Informe o vetor a: ");

        for (int i = 0; i < a.length; i++) {
            
            a[i] = scanner.nextInt();
            d[y] = a[i];
            y += 3;
        }

        System.out.println("Informe o vetor b: ");
        y = 1;

        for (int i = 0; i < b.length; i++) {
            
            b[i] = scanner.nextInt();
            d[y] = b[i];
            y += 3;
        }

        System.out.println("Informe o vetor c: ");
        y = 2;

        for (int i = 0; i < c.length; i++) {
            
            c[i] = scanner.nextInt();
            d[y] = c[i];
            y += 3;
        }

        System.out.print("Vetor d: ");

        for (int i = 0; i < d.length; i++) {
            
            System.out.print(d[i] + " ");
        }

        scanner.close();
    }
}
