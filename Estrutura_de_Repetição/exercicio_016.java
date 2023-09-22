/*16. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500. */

import java.util.Scanner;

public class exercicio_016 {
    
    public static void main(String[] args){

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
    
        Scanner scanner = new Scanner(System.in);

        while(num1 < 500){

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.print(num1 + " ");
        }

        scanner.close();
    }
}
