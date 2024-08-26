/*14. Faça um procedimento que lê 50 valores inteiros e retorna o maior e o menor deles.*/

import java.util.Random;

class exercicio_014
{
    public static void main(String[] args)
    {
        int[] maior = new int[1];
        int[] menor = new int[1];

        System.out.println("informe 50 valores inteiros: ");

        maior_menor(maior,menor);

        System.out.printf("Maior:%d\nMenor: %d",maior[0],menor[0]);

    }

    static void maior_menor(int[] maior,int[] menor)
    {
        int valores = 0;
        maior[0] = Integer.MIN_VALUE;// Inicializa o maior com o menor valor possível de um inteiro
        menor[0] = Integer.MAX_VALUE;// Inicializa o menor com o maior valor possível de um inteiro
        Random rand = new Random();
        //Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 50; i++){
            
            valores = rand.nextInt(10000); //usado para gerar numeros aleatórios e simular entrada do usuário.

            //valores = scan.nextInt(); Aqui, os valores de entrada foram substituidos por uma função que gera números aleatórios

            if (valores > maior[0])
            {
                maior[0] = valores;
                
            }
            if (valores < menor[0])
            {
                menor[0] = valores;
            } 
        }
    }
}