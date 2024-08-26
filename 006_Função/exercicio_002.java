/*2. Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir o imposto sobre vendas.*/

import java.util.Scanner;

public class exercicio_002
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o a taxa de imposto: ");
        float taxaImposto = scan.nextInt();
        System.out.print("Informe o custo do preoduto: ");
        float custo = scan.nextInt();

        float custo_final = somaImposto(taxaImposto,custo);

        System.out.println("Valor do produto com imposto: " + custo_final);
        scan.close();
    }
    static float somaImposto(float taxaImposto,float custo)
    {

        float custo_final = custo + (custo*(taxaImposto / 100));

        return custo_final;
    }
}