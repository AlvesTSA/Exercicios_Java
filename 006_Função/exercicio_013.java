/*13. Faça uma função que receba um valor inteiro e positivo e calcula o seu fatorial.*/

import java.util.Scanner;

class exercicio_013
{
    public static void main(String[] args)
    {
        int[] num = new int[1];
        int fatorial = 0;

        System.out.println("Informe um numero inteiro e positivo: ");

        fatorial = calcFatorial(num);

        System.out.printf("%d! = %d",num[0],fatorial);

    }    
    static int calcFatorial(int[] numero)
    {
        numero[0] = 0;
        int fatorial = 1;

        Scanner scan = new Scanner(System.in);
        do
        {
            numero[0] = scan.nextInt();

            if (numero[0] < 0)
            {
                System.out.println("ERRO: o numero informado deve ser maior ou igual a zero.");
            }
            
        } while (numero[0] < 0);
        
        for (int i = 2; i <= numero[0]; i++)
        {
            fatorial *= i;
        }
        
        scan.close();
        return fatorial;
    }
}