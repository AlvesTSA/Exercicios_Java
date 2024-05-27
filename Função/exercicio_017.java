/*17. Escreva uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o somatório desse valor.*/

import java.util.Scanner;

class exercicio_017
{
    public static void main(String[] args)
    {
        int soma = 0;
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
        
        soma = somatorio(n);

        System.out.printf("Somatório de %d: %d",n,soma);

        scan.close();
    }
    
    static int somatorio(int n)
    {
        int soma = 0;

        for (int i = 1; i <= n; i++)
        {
            soma += i;
        }
        
        return soma;
    }
}