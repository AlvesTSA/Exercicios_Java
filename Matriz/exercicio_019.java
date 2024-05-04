/*19. Leia duas matrizes 10 x 10 e faça uma substituição entre a diagonal inferior da primeira coma diagonal superior da segunda.*/

import java.util.Random;

public class exercicio_019 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size = 10;
        final int max = 10;
        final int min = 0;
        int[][] matrizA = new int[size][size];
        int[][] matrizB = new int[size][size];
        
        for (int i = 0; i < size; i++){
        
            for (int j = 0; j < size; j++){
                
                matrizA[i][j] = random.nextInt(min,max);
                matrizB[i][j] = random.nextInt(min,max);
            }
        }

        System.out.println("Matrizes originais:");
        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                System.out.print(matrizB[i][j]+" ");
            }
            System.out.println();
        }

        int temp = 0;
        
        for (int i = 0; i < size; i++){
            
            for (int j = i + 1; j < size; j++){
                
                temp = matrizA[j][i];
                matrizA[j][i] = matrizB[i][j];
                matrizB[i][j] = temp;
            }
        }

        System.out.println("Matrizes invertidas:");
        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                System.out.print(matrizB[i][j]+" ");
            }
            System.out.println();
        }
    }
}
