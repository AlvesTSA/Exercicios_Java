/*10. Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles. */

import java.util.Scanner;

public class exercicio_010 {
    
    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int temp = 0;
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois numeros: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1 > num2){
            
            temp = num1;
            num1 = num2;
            num2 = temp;

        }

        while(num1 < num2 - 1){
            
            num1++;
            System.out.print(num1 + " ");
        }

        scanner.close();
    }
}
