/* 14. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.*/

import java.util.Scanner;

public class exercicio_014{

    public static void main(String[] args){

        int impar = 0;
        int par = 0;
        int resto = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 numeros inteiros: ");
       
        for(int i = 0; i < 10; i++){

            num = scanner.nextInt();

            resto = num % 2;

            if (resto == 0) {
               
                par++;
            }
            else{

                impar++;
            }
        }

        System.out.print("Quantidade impar: " + impar + "\nQuantidade par: " + par);

        scanner.close();
    }
}