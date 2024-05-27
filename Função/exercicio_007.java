/*7. Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou negativo. A função deve retornar um valor booleano.*/

import java.util.Scanner;

class exercicio_007
{
    public static void main(String[] args)
    {
        int num = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        num = scan.nextInt();

        if (positivo_negativo(num))
        {
            System.out.println("O valor informado é positivo.");
        }
        else
        {
            System.out.println("O valor informado é negativo.");
        }

        scan.close();
    }

    static boolean positivo_negativo(int numero)
    {
        return numero > 0;
    }
}