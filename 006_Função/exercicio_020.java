/*20. Faça um programa que converta da notação de 24 horas para a notação de 12 horas. Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é dada em dois inteiros. Deve haver pelo menos duas funções: uma para fazer a conversão e uma para a saída. Registre a informação A.M./P.M. como um valor ‘A’ para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões terá um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que permita que o usuário repita esse cálculo para novos valores de entrada todas as vezes que desejar.*/

import java.util.Scanner;

class exercicio_020
{
    public static void main(String[] args)
    {
        int[] hora12  = new int[1];
        int[] min12 = new int[1]; 
        int hora24 = 0;
        int min24 = 0;
        char[] prefixo = new char[1];
        char sair = ' ';

        Scanner scan =new Scanner(System.in);

        do
        {
            System.out.print("Informe a hora no formato (HH MM):\n");
            hora24 = scan.nextInt();
            min24 =  scan.nextInt();

            converterHora(hora24,min24,hora12,min12,prefixo);
            imprimir(hora12,min12,prefixo);

            System.out.print("\nDeseja inserir mais algum valor, digite S para sim e N para nao:");
            String entrada = scan.next(); // Lê a entrada como uma string
            sair = entrada.charAt(0); // Pega o primeiro caractere da string

        } while (sair == 's' || sair == 'S');

        scan.close();
    }

    static void converterHora(int hora24,int min24,int[] hora12,int[] min12,char[] prefixo){

        min12[0] = min24;

        if (hora24 == 0)
        {
            hora12[0] = 12;
            prefixo[0] = 'A';
        }
        else if (hora24 < 12)
        {
            hora12[0] = hora24;
            prefixo[0] = 'A';
        }
        else if (hora24 == 12)
        {
            hora12[0] = 12;
            prefixo[0] = 'P';
        }
        else
        {
            hora12[0] = hora24 - 12;
            prefixo[0] = 'P';
        }  
    }

    static void imprimir(int[] hora12, int[] min12,char[] prefixo){

        System.out.printf("Horario convertido: %02d:%02d %c.M",hora12[0],min12[0],prefixo[0]);
    }
}