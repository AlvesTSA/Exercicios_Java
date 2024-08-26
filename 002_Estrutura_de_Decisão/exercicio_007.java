/*. Faça um Programa que leia três números e mostre o maior e o menor deles. */

import java.util.Scanner;

public class exercicio_007 {

    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int maior = 0;
        int menor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe três números: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            
            maior = num1;

            if (num2 < num3) {
                
                menor = num2;
            }
            else{

                menor = num3;

            }
        }

        else if (num2 > num1 && num2 > num3) {
            
            maior = num2;

            if (num1 < num3) {
                
                menor = num1;
            }
            else{

                menor = num3;
                
            }
        }

        else {
            
            maior = num3;

            if (num1 < num2) {
                
                menor = num1;
            }
            else{

                menor = num2;
                
            }
        }

        System.out.print("Maior: " + maior + "\nMenor: " + menor);

        scanner.close();

    } 
    
}
