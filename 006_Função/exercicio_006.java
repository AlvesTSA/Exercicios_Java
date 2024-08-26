/*6. Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade expressa em dias.*/

import java.util.Scanner;

class exercicio_006
{
    public static void main(String[] args)
    {
        int a = 0;
        int m = 0;
        int d = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe os anos de sua idade: ");
        a = scan.nextInt();
        System.out.print("Informe os meses de sua idade: ");
        m = scan.nextInt();
        System.out.print("Informe os dias de sua idade: ");
        d = scan.nextInt();

        d = transformaIdade(a,m,d);

        System.out.printf("Voce tem %d dias de idade.",d);

        scan.close();
    }

    static int transformaIdade(int anos,int meses,int dias){

        dias += anos * 365 + meses * 30;

        return dias;
    }
}