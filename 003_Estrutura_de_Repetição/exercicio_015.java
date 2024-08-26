/*15. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo.*/

import java.util.Scanner;

public class exercicio_015 {
    
    public static void main(String[] args){

        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int n = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe ate qual termo deseja calcular: ");
        n = scanner.nextInt();

        for(int i = 0; i < n; i++){

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

            System.out.print(num1 + " ");
        }

        scanner.close();
    }
}
