/*8. Leia uma matriz 8x 8 e escreva o maior elemento da diagonal principal e a soma dos elementos da diagonal secundaria.*/

import java.util.Random;

public class exercicio_008 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size = 8;
        final int max = 100;
        final int min = 0;
        int[][] matriz = new int[size][size];
        int maior = 0;

        System.out.println("Informe uma matriz " + size +" x " + size + ": ");

        for (int i = 0; i < size; i++){
            
            for (int y = 0; y < size; y++){
                
                matriz[i][y] = random.nextInt(min,max);
            }
        }

        //maior valor da diagonal principal
        maior = matriz[0][0];

        for (int i = 0; i < size; i++){
            
            if (matriz[i][i] > maior){
                
                maior = matriz[i][i];
            }
        }
        
        //soma da diagonal secundária
        int soma = 0;
        int j = size - 1;

        for (int i = 0; i < size; i++){
            
            soma += matriz[i][j];
            j--;
        }
        
        System.out.print("\nMatriz lida:\n");

        for (int i = 0; i < size; i++){
            
            for (int y = 0; y < size; y++){
                
                System.out.print(matriz[i][y] + " ");
            
            }
            System.out.println();
        }

        System.out.print("Diagonal principal: ");

        for (int i = 0; i < size; i++){
            
            System.out.print(matriz[i][i] + " ");
        }

        System.out.print("\nMaior valor da diagonal principal: " + maior);
        System.out.print("\nDiagonal secundaria: ");
        j = size - 1;

        for (int i = 0; i < size; i++){
            
            System.out.print(matriz[i][j] + " ");
            j--;
        }

        System.out.print("\nSoma da diagonal secundaria: " + soma);
    }
}
