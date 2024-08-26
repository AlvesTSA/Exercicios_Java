/*25. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada. */

import java.util.Scanner;

public class exercicio_025 {
    
    public static void main(String[] args){

        int n = 0;
        float idade = 0;
        float soma = 0;
        float media = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantas pessoas deseja informar a idade: ");
        n = scanner.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.println("Informe a idade da pessoa " + i + ":");
            idade = scanner.nextFloat();

            soma += idade;
        }
        media = soma/n;

        if (media > 0 && media <= 25) {
            
            System.out.println("Turma jovem.");
        }
        else if (media >= 26 && media <= 60) {
            
            System.out.println("Turma adulta.");
        }
        else{

            System.out.println("Turma idosa.");
        }

        scanner.close();
    }
}
