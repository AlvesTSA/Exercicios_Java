/*11. A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e número de filhos. Faça um procedimento que leia esses dados para um número não determinado de pessoas e retorne a média de salário da população, a média do número de filhos, o maior salário e o percentual de pessoas com salário até R$350,00.*/

import java.util.Scanner;

class exercicio_011
{
    public static void main(String[] args)
    {
        float[] media_salario = new float[1];
        int[] media_filhos = new int[1];
        float[] maior_salario =new float[1];
        float[] percentual = new float[1];
        
        pesquisa(media_salario, media_filhos, maior_salario, percentual);
        
        System.out.printf("Media salarial: %.2f\n", media_salario[0]);
        System.out.printf("Media de filhos: %d\n", media_filhos[0]);
        System.out.printf("Maior salario: %.2f\n", maior_salario[0]);
        System.out.printf("Percentual de salario ate R$ 350,00: %.2f%%\n", percentual[0]);
    }

    static void pesquisa(float[] media_salario,int[] media_filhos,float[] maior_salario,float[] percentual)
    {
        int num_filhos = 0;
        float salario = 0.0F;
        int count = 0;
        int count2 = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Preencha os dados ou digite -1 nos dois campos para sair\n");
        
        do
        {
            System.out.print("Informe seu salario: ");
            salario = scan.nextFloat();
            System.out.print("Informe quantos filhos voce tem: ");
            num_filhos = scan.nextInt();

            if (salario == -1 && num_filhos == -1)
            {
                break;
            }
            
            count2++;
            media_salario[0] += salario;
            media_filhos[0] += num_filhos;

            if (salario > maior_salario[0])
            {
                maior_salario[0] = salario;
            }
            if (salario > 0 && salario <= 350.0F)
            {
                count++;
            }
        }while(salario != -1 && num_filhos != -1);

        media_salario[0] /= (float)count2;
        media_filhos[0] /= count2;
        percentual[0] = (count*100.0F) / (float)count2;
        
        scan.close();
    }
}