/*16. Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o número de divisores desse valor.*/

import java.util.Scanner;

class exercicio_016
{
    public static void main(String[] args)
    {
        int count = 0;
        int valor = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        valor = scan.nextInt();

        count = divisores(valor);

        System.out.printf("O valor informado e divisivel por %d numeros.\n",count);

        scan.close();
    }

    static int divisores(int valor)
    {
        float resto = 0;
        int count = 0;

        for (int i = 1; i <= valor; i++)
        {
            resto = valor % i;

            if (resto == 0)
            {
                count++;
            }
        }
        
        return count;
    }
}