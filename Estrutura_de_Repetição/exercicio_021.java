/*21. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1. */
import java.util.Scanner;

public class exercicio_021 {
    
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
        }
        else{

            System.out.println("Primo: sim");
        }

        scanner.close();
    }
}
