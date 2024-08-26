/*11. Altere o programa anterior para mostrar no final a soma dos números. */

import java.util.Scanner;

public class exercicio_011 {
    
    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int temp = 0;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois numeros: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1 > num2){
            
            temp = num1;
            num1 = num2;
            num2 = temp;

        }

        System.out.print("Intervalo entre " + num1 + " e " + num2 + " : ");

        while(num1 < num2 - 1){
            
            num1++;
            System.out.print(num1 + " ");
            soma += num1; 
        }

        System.out.print("\nSoma: " + soma);

        scanner.close();
    }
}
