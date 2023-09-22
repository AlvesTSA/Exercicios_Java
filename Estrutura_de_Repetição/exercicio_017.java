/*17. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 */

import java.util.Scanner;

public class exercicio_017 {
    
    public static void main(String[] args){

        int num = 0;
        int fatorial = 0;
        int n = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor ao qual deseja calcular o fatorial: ");
        n = scanner.nextInt();

        num = n;
        fatorial = num;

        System.out.print(num + "! = " + num);
        for(int i = 1; i < n ; i++){

            num--;
            fatorial *= num;

            System.out.print(" x " + num);
        }

        System.out.print(" = " + fatorial);

        scanner.close();
    }
}
