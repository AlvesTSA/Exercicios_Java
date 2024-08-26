/*Faça um Programa que leia três números e mostre o maior deles. */

import java.util.Scanner;

public class exercicio_006 {

    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int maior = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe três números: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            
            maior = num1;

        }

        else if (num2 > num1 && num2 > num3){

            maior = num2;

        }

        else{

            maior = num3;

        }

        System.out.print("Maior: " + maior);

        scanner.close();

    }
    
}
