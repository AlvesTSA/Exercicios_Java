/*. Faça um Programa que peça dois números e imprima o maior deles. */

import java.util.Scanner;

public class exercicio_001{

    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int maior = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois números: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if (num1 > num2) {
            
            maior = num1;
        }
        else{

            maior = num2;
        }

        System.out.print("O maior número informado: " + maior);

        scanner.close();

    }

}