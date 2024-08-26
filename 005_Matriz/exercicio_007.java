/*7. Leia duas matrizes 4 x 4 e escreva uma terceira com os 4 maiores elementos entre as primeiras*/

import java.util.Random;

public class exercicio_007 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size = 4;
        final int max = 100;
        final int min = 1;
        int[][] matrizA = new int[size][size];
        int[][] matrizB = new int[size][size];
        int[] maiores = new int[size*size + size*size]; // Vamos armazenar os maiores valores de ambas as matrizes aqui
        int k = 0; // indice para percorrer o array de maiores valores
        int[][] matrizResultante = new int[size][size]; // Matriz para armazenar os 4 maiores valores

        System.out.println("Informe os elementos da matriz A:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrizA[i][j] = random.nextInt(min,max);
                maiores[k++] = matrizA[i][j];
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Informe os elementos da matriz B:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrizB[i][j] = random.nextInt(min,max);
                maiores[k++] = matrizB[i][j];
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        // Ordenar os maiores valores em ordem decrescente
        for (int i = 0; i < (size*size + size*size) - 1; i++) {
            for (int j = i + 1; j < (size*size + size*size); j++) {
                if (maiores[i] < maiores[j]) {
                    int temp = maiores[i];
                    maiores[i] = maiores[j];
                    maiores[j] = temp;
                }
            }
        }

        System.out.println("Matriz resultante:");
        // Preencher a matriz resultante com os 4 maiores valores
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrizResultante[i][j] = maiores[j];
                System.out.print(matrizResultante[i][j] + " ");
            }
            System.out.println();
        }
    }
}
