/*3. Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.*/

import java.util.Scanner;

class exercicio_003
{
    public static void main(String[] args){

        int size = 3;
        float[] num = new float[size];
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < size; i++)
        {
            System.out.print("Informe o número " +(i + 1) + ": " );
            num[i] = scan.nextInt();
        }

        float result = sum(num[0],num[1],num[2]);
        System.out.println("Soma dos números: "+result);

        scan.close();
    }

    static float sum(float a, float b, float c){

        float resultado = a + b + c;

        return resultado;
    }
}