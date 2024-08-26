/*15. Faça um procedimento que recebe, por parâmetro, um valor N e calcula e escreve a tabuada de 1 até N. Mostre a tabuada na forma:

1 x N = N
2 x N = 2N
...
N x N = N^2*/

import java.util.Scanner;

class exercicio_015
{
    public static void main(String[] args)
    {
        int N = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o numero que deseja ver a tabuada: ");
        N = scan.nextInt();

        tabuada(N);

        scan.close();
    }
    static void tabuada(int N)
    {
        for (int i = 1; i <= N; i++)
        {
            System.out.printf("%d x %d = %d\n",i,N,N*i); 
        }
    }
}
