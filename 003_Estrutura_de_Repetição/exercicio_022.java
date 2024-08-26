/*22. Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por quais número ele é divisível. */

import java.util.Scanner;

public class exercicio_022 {
    
    public static void main(String[] args){

        int num = 0;
        int resto = 0;
        int divisivel = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        num = scanner.nextInt();

        for(int i = 1; i <= num; i++){

            resto = num % i;

            if (resto == 0) {
                
                divisivel++;
            }
        }
        if (divisivel > 2) {
            
            System.out.println("Primo: nao");

            for(int i = 1; i <= num; i++){

                resto = num % i;

                if (resto == 0) {
                    
                    System.out.println("Divisivel por: " + i);
                }
            }
        }
        else{

            System.out.println("Primo: sim");
        }

        scanner.close();
    }
}
