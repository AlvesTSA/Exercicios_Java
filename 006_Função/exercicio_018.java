/*18. Faça um programa para imprimir:

1
2   2
3   3   3
.....
n   n   n   n   n   n  ... n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.*/

import java.util.Scanner;

class exercicio_018
{
    public static void main(String[] args)
    {
        int n = 0;

        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.print("Informe um valor inteiro: ");
            n = scan.nextInt();

            if (n <= 0) 
            {
                System.out.println("Erro: o número deve ser inteiro e positivo.");
            }

        } while (n <= 0);

        imprimir(n);

        scan.close();
    }

    static void imprimir(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.printf("%d ",i);
            }
            System.out.println();
        }      
    }
}