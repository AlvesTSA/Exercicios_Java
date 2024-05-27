/*1. Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.*/

import java.util.Scanner;

class exercicio_001{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int num = scan.nextInt();

        char result = positivoNegativo(num);

        System.out.print("O numero informado: " + result);

        scan.close();
    }

    static char positivoNegativo(int num)
    {
        if(num >= 0)
        {
            return 'P';
        }
        else
        {
            return 'N';
        }
    }
}