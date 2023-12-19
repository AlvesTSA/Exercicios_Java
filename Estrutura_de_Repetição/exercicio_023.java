/*23. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos. Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados. */
import java.util.Scanner;

public class exercicio_023 {
    
    public static void main(String[] args){

        int n = 0;
        int resto = 0;
        int divisivel = 0;
        int divisoes = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor limite de intervalo ao qual deseja ver os numeros primos");
        n = scanner.nextInt();

        for(int i = 1; i <= n; i++){

            divisivel = 0;

            for(int y = 1; y <= i; y++){

                resto = i % y;
                divisoes++;
                
                if (resto == 0) {
                    
                    divisivel++;
                }
            }
            if (divisivel < 3) {
                
                System.out.print(i + " ");
            }
            
        }

        System.out.println("\nNumero de divisoes: " + divisoes);
        scanner.close();
    }
}
