/*17. Leia uma matriz 8 x 8 e a transforme numa matriz triangular inferior , atribuindo zero a todos os elementos acima da diagonal principal, escrevendo-a ao final.*/

import java.util.Random;

public class exercicio_017 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size = 8;
        final int max = 10;
        final int min = 0;
        int[][] matriz = new int[size][size];

        for (int w = 0; w < size; w++){
        
            for (int z = 0; z < size; z++){
                
                matriz[w][z] = random.nextInt(min,max);
            }
        }

        int i,j = 0;

        for (i = 0; i < size; i++){
            
            for (j = 0; j < size; j++){
                
                if (j > i){
                    
                    matriz[i][j] = 0;
                }
                
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }     
    }
}
