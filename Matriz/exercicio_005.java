/*5. Leia duas matrizes 20 x 20 e escreva os valores da primeira que ocorrem em qualquer posição da segunda.*/

import java.util.Random;

public class exercicio_005 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size = 20;
        final int intervalo_max = 1000;
        final int intervalo_min = 1;
        int[][] matrizA = new int[size][size];
        int[][] matrizB = new int[size][size];

        for (int i = 0; i < size; i++){
    
            for (int j = 0; j < size; j++){
            
                matrizA[i][j] = random.nextInt(intervalo_min,intervalo_max);
                matrizB[i][j] = random.nextInt(intervalo_min,intervalo_max);
            } 
        }
        
        System.out.println("Todos os valores da matriz A que estao na matriz B\n");
        
        for (int i = 0; i < size; i++){
        
            for (int j = 0; j < size; j++){
            
                for (int w = 0; w < size; w++){
        
                    for (int z = 0; z < size; z++){
                    
                        if (matrizA[i][j] == matrizB[w][z]){
                                
                            System.out.print(matrizA[i][j] + " ");
                        }
                        
                    } 
                }
            } 
        }
    }
}
