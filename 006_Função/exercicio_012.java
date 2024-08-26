/*12. Faça uma função que leia um número não determinado de valores positivos e retorna a média aritmética dos mesmos.*/

import java.util.Scanner;

class exercicio_012
{
    public static void main(String[] args)
    {
        float media = mediaAritmetica();
        System.out.printf("Media aritmetica: %.2f\n",media);
    }

    static float mediaAritmetica()
    {
        float media = 0.0F;
        float numero = 0.0F;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe numeros inteiros ou informe -1 para sair:");

        do
        {
            numero = scan.nextFloat();

            if (numero == -1)
            {
                break;
            }
            
            media += numero;
            count++;
            
        } while (numero != -1);

        scan.close();

        if (count == 0) 
        {
            return 0.0F; // Evita divisão por zero se nenhum número for inserido
        }
        
        return media / count; 
    }
}