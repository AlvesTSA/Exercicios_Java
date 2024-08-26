/*28. Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um. */

import java.util.Scanner;

public class exercicio_028 {
    
    public static void main(String[] args){

        int quant_CD = 0;
        float valor_CD = 0;
        float soma = 0;
        float media = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos CDs vai calcular: ");
        quant_CD = scanner.nextInt();

        for(int i = 1; i <= quant_CD; i++){

            System.out.println("Informe o valor do CD " + i + ":");
            valor_CD = scanner.nextFloat();

            soma += valor_CD;
        }
        media = soma/quant_CD;

        System.out.println("media por CD: " + media);
        System.out.println("Total gasto: " + soma);

        scanner.close();
    }
}
