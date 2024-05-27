/*8. Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar. A função deve retornar um valor booleano*/

import java.util.Scanner;

class exercicio_008
{
    public static void main(String[] args)
    {
        int num = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        num = scan.nextInt();

        if (impar_par(num))
        {
            System.out.println("O numero informado é PAR");
        }
        else
        {
            System.out.println("O numero informado é IMPAR");
        }

        scan.close();
    }
    static boolean impar_par(int numero)
    {
        return numero % 2 == 0;
    }
}