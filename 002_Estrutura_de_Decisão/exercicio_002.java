/*Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. */

import java.util.Scanner;

public class exercicio_002 {

    public static void main(String [] args){

        int valor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        valor = scanner.nextInt();

        if (valor > 0) {

            System.out.print("VALOR POSITIVO");

        }
        else{

            System.out.print("VALOR NEGATIVO");
            
        }

        scanner.close();
    }

    
}
