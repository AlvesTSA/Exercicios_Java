/* Faça um Programa que leia três números e mostre-os em ordem decrescente. */

import java.util.Scanner;

public class exercicio_009 {
    
    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int maior1 = 0;
        int maior2 = 0;
        int maior3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe trÊs números: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {

            maior1 = num1;
            
            if (num2 > num3) {
                
                maior2 = num2;
                maior3 = num3;

            }
            else {

                maior2 = num3;
                maior3 = num2;

            }
            
        }

        else if (num2 > num1 && num2 > num3) {

            maior1 = num2;
            
            if (num1 > num2) {
                
                maior2 = num1;
                maior3 = num3;

            }
            else {

                maior2 = num3;
                maior3 = num1;
                
            }
            
        }

        else {

            maior1 = num3;
            
            if (num1 > num2) {
                
                maior2 = num1;
                maior3 = num2;

            }
            else {

                maior2 = num2;
                maior3 = num1;
                
            }
            
        }

        System.out.print("Ordem decrescente: \n" + maior1 + "\n" + maior2 + "\n" + maior3);

        scanner.close();
        
    }

}
