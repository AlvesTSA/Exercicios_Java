/*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. */

import java.util.Scanner;

public class exercicio_008 {
    
    public static void main(String[] args){

        float produto_a = 0;
        float produto_b = 0;
        float produto_c = 0;
        float barato = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço de três produtos: ");
        produto_a = scanner.nextFloat();
        produto_b = scanner.nextFloat();
        produto_c = scanner.nextFloat();

        if (produto_a < produto_b && produto_a < produto_c) {

            barato = produto_a;
            
        }

        else if (produto_b < produto_a && produto_b < produto_c) {

            barato = produto_b;
            
        }

        else{

            barato = produto_c;

        }

        System.out.print("Compre o mais barato: " + barato);

        scanner.close();
        
    }
}
