/*16. Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus vendedores com base em comissões. O vendedor recebe $200 por semana mais 9 por cento de suas vendas brutas daquela semana. Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana recebe $200 mais 9 por cento de $3000, ou seja, um total de $470. Escreva um programa (usando um array de contadores) que determine quantos vendedores receberam salários nos seguintes intervalos de valores:

 a. $200 - $299 

 b. $300 - $399 

 c. $400 - $499

 d. $500 - $599

 e. $600 - $699
 
 f. $700 - $799
 
 g. $800 - $899

 h. $900 - $999

 i. $1000 em diante

Desafio: Crie ma fórmula para chegar na posição da lista a partir do salário, sem fazer vários ifs aninhados.*/

import java.util.Scanner;

public class exercicio_016 {
    
    public static void main(String[] args){

        int[] contador = new int[9];
        float taxa_comiss = 0.09F;
        float venda = 0;
        float salario = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            
            System.out.print("Informe a o valor de venda do vendedor " + (i + 1) + ": ");
            venda = scanner.nextFloat();

            if (venda == -1){
                
                break;
            }

            salario = (venda*taxa_comiss) + 200;
            salario /= 100;

            if(salario >= 10){

                contador[8]++;
            }
            else{

                contador[(int)salario - 2]++;
            }
            
        }

        System.out.println("a. $200 - $299: " + contador[0] + " vendedores");
        System.out.println("b. $300 - $399: " + contador[1] + " vendedores");
        System.out.println("c. $400 - $499: " + contador[2] + " vendedores");
        System.out.println("d. $500 - $599: " + contador[3] + " vendedores");
        System.out.println("e. $600 - $699: " + contador[4] + " vendedores");
        System.out.println("f. $700 - $799: " + contador[5] + " vendedores");
        System.out.println("g. $800 - $899: " + contador[6] + " vendedores");
        System.out.println("h. $900 - $999: " + contador[7] + " vendedores");
        System.out.println("i. $1000 em diante: " + contador[8] + " vendedores");

        scanner.close();
    }
}
