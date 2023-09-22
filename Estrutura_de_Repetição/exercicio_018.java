/*18. . Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores. */

import java.util.Scanner;

public class exercicio_018 {
    
    public static void main(String[] args){

        int maior = 0;
        int menor = 0;
        int n = 0;
        int num = 0;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de números: ");
        n = scanner.nextInt();
        num = scanner.nextInt();

        maior = num;
        menor = num;
        soma += num;

        for(int i = 1; i < n; i++){

            num = scanner.nextInt();

            if (num > maior) {
                
                maior = num;
            }
            else if (num < menor) {
                
                menor = num;
            }

            soma += num;
        }

        System.out.print("Maior = " + maior + "\nMenor = " + menor + "\nSoma = " + soma);

        scanner.close();
    }
}
