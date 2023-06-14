/*
Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.Exemplo:326 = 3 centenas, 2 dezenas e 6 unidades
*/
import java.util.Scanner;

public class exercicio_021 {
    
    public static void main(String[] args){

        int centena = 0;
        int dezena = 0;
        int unidade = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro de 0 a 999");
        num = scanner.nextInt();

        if(num >= 0 && num < 1000){

            centena = num/100;
            num %= 100;
            dezena = num/10;
            num %= 10;
            unidade = num;
        }
        else{
            
            System.out.println("Informe um valor válido");

            scanner.close();


        }

        System.out.println("Centena: " + centena + "\nDezena: " + dezena + "\nUnidade: " + unidade);

        scanner.close();

    }
}
