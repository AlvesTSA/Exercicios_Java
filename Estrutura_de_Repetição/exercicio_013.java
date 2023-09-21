/*13. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem. */

import java.util.Scanner;

public class exercicio_013 {
    
    public static void main(String[] args){

        int base = 0;
        int expoente = 0;
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base depois o expoente: ");
        base = scanner.nextInt();
        expoente = scanner.nextInt();
        resultado = base;
        System.out.print(base + " elevado a " + expoente + " = ");

        for(int i = 1; i < expoente; i++){

            resultado *= base;

        }

        System.out.println(resultado);

        scanner.close();
    }
}
