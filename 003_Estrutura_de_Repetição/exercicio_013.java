/*13. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem. */

import java.util.Scanner;

public class exercicio_013 {
    
    public static void main(String[] args){

        double base = 0;
        int expoente = 0;
        double resultado = 0;
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base depois o expoente: ");
        base = scanner.nextInt();
        expoente = scanner.nextInt();
        resultado = base;
        System.out.print(base + " elevado a " + expoente + " = ");

        if (expoente > 0){

            i = 1;

            while (i != expoente){
                
                i++;
                resultado *= base;
            }
            
        }
        else if (expoente < 0){

            i = 1;
            expoente *= -1;

            while (i != expoente){
                
                i++;
                resultado *= base;
            }
            
            resultado = 1/resultado;
        }
        else{

            resultado = 1;
        }

        System.out.println(resultado);

        scanner.close();
    }
}
