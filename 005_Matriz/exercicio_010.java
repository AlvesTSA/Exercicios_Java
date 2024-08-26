/*10. Leia uma matriz 50 x 2, onde cada coluna corresponde a um lado de um triangulo retângulo. Declare um vetor que contenha a área dos respectivos triângulos e o escreva.*/

import java.util.Random;

public class exercicio_010 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size_l = 50;
        final int size_c  = 2;
        final int max = 10;
        final int min = 1;
        int[][] matriz = new int[size_l][size_c];
        float[] vetor = new float[size_l];
        final float C = 0.5F;

        System.out.println("Informe uma matriz " + size_l  + " x " + size_c  + ": ");
        System.out.println();

        for (int i = 0; i < size_l; i++){
            
            for (int j = 0; j < size_c; j++){
                
                matriz[i][j] = random.nextInt(min,max);
            }
        }

        System.out.print("Matriz lida: \n");
        
        for (int i = 0; i < size_l; i++){
            
            for (int j = 0; j < size_c; j++){
                
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Areas dos triangulos: \n");

        for (int i = 0; i < size_l; i++){
            
            vetor[i] = (float)matriz[i][0] * (float)matriz[i][1] * C;
            System.out.print(vetor[i] + " ");
        }
    }
}
