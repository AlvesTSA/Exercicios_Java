/*20. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16. */

import java.util.Scanner;

public class exercicio_020 {
    
    public static void main(String[] args){

        int num = 0;
        int fatorial = 0;
        int n = 0;
        int op = 0;

        Scanner scanner = new Scanner(System.in);

        do{

            System.out.print("Informe o valor ao qual deseja calcular o fatorial: ");

            do{

                n = scanner.nextInt();

                if (n <= 0 || n >= 16) {

                    System.out.println("ERRO: Informe numeros entre 0 e 16.");
                }
                
            }while(n <= 0 || n >= 16);
            

            num = n;
            fatorial = num;

            System.out.print(num + "! = " + num);

            for(int i = 1; i < n ; i++){

                num--;
                fatorial *= num;

                System.out.print(" x " + num);
            }

            System.out.println(" = " + fatorial);

            System.out.println("Informe 1 para continuar e 0 para sair.");
            op = scanner.nextInt();

        }while(op == 1);

        scanner.close();
    }
}
