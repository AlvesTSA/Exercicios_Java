/*10. Escreva um procedimento que recebes 3 valores reais X, Y e Z e que verifique se esses valores podem ser os comprimentos dos lados de um triângulo e, neste caso, retornar qual o tipo de triângulo formado. Para que X, Y e Z formem um triângulo é necessário que a seguinte propriedade seja satisfeita: o comprimento de cada lado de um triângulo é menor do que a soma do comprimento dos outros dois lados. O procedimento deve identificar o tipo de triângulo formado observando as seguintes definições:

Triângulo Equilátero: os comprimentos dos 3 lados são iguais.
Triângulo Isósceles: os comprimentos de 2 lados são iguais.
Triângulo Escaleno: os comprimentos dos 3 lados são diferentes.*/

import java.util.Scanner;

class exercicio_010
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        int z = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os 3 lados do triangulo:");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        String resultado = triangulo(x,y,z);

        System.out.printf("Resultado: %s\n",resultado);

        scan.close();
    }

    static String triangulo(int x, int y, int z)
    {

        if (x >= y + z || y >= x + z || z >= x + y)
        {
            return "Nao é triangulo";
        }
        else if (x == y && x == z)
        {
            return "Equilátero";
        }
        else if (x == y || x == z || y == z)
        {
            return "Isóseles";
        }
        else
        {
            return "Escaleno";
        }
    }
}