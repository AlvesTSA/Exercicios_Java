/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. */

import java.util.Scanner;

public class exercicio_001{

    public static void main(String[] args) {
        
        int nota = 0;

        Scanner scanner = new Scanner(System.in);

        do{

            System.out.println("Informe uma nota entre zero e dez: ");
            nota = scanner.nextInt();

            if(nota <= 0 || nota >= 10){

                System.out.println("Noata inválida, tente novamente");
            }

        }while(nota <= 0 || nota >= 10);

        System.out.println("Nota atribuida com sucesso");

        scanner.close();
    }
}