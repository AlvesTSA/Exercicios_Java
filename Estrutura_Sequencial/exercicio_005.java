//Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma medida em metros");

        int m = scanner.nextInt();

        int cm = 100*m;

        System.out.println("A medida em centímetro é: "+cm );

        scanner.close();


    }

}
