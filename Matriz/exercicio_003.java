/*3. Leia uma matriz 20 x 20. Leia também um valor X. O programa deverá fazer uma busca desse valor na matriz e, ao final escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”. */

import java.util.Scanner;
import java.util.Random;

public class exercicio_003{

    public static void main(String[] args){

        Random random = new Random();
        final int size = 20;
        final int intervalo_max = 1000;
        final int intervalo_min = 0;
        int[][] matriz = new int[size][size];
        int x = 0;
        int i,j = 0;
        int[] loc = new int[2];
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor de x: ");
        x = scanner.nextInt();

        for (i = 0; i < size; i++){
            
            for (j = 0; j < size; j++){
                
                matriz[i][j] = random.nextInt(intervalo_min,intervalo_max); 
            }
        }

        for (i = 0; i < size; i++){
            
            for (j = 0; j < size; j++){
            
                if (matriz[i][j] == x){
                    
                    loc[0] = i;
                    loc[1] = j;

                    System.out.println("Valor encontrado\nlinha: " + loc[0] + "\nColuna: " + loc[1]);
                    count++;
                } 
            }
        }

        if (count == 0){
            
            System.out.println("Valor nao encontrado");
        }

        scanner.close();
    }
}
