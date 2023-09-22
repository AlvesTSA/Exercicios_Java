/*19. . Altere o programa anterior para que ele aceite apenas números entre 0 e 1000. */

import java.util.Scanner;

public class exercicio_019 {
    
    public static void main(String[] args){

        int maior = 0;
        int menor = 0;
        int n = 0;
        int num = 0;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de números: ");
        n = scanner.nextInt();

        do{

            num = scanner.nextInt();

            if (num <= 0 || num >= 1000) {
                System.out.println("ERRO: informe numeros entre 0 e 1000");
        
            }

        }while(num <= 0 || num >= 1000);
        

        maior = num;
        menor = num;
        soma += num;

        for(int i = 1; i < n; i++){

            do{
            
                num = scanner.nextInt();

                if (num <= 0 || num >= 1000) {

                    System.out.println("ERRO: informe numeros entre 0 e 1000");
            
                }

            }while(num <= 0 || num >= 1000);

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
