/*19. Faça um programa para imprimir:

1
1   2
1   2   3
.....
1   2   3   ...  n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro imprima até a n-ésima linha.*/

import java.util.Scanner;

class exercicio_019
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
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }      
    }
}