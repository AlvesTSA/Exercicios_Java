/*9. Leia uma matriz 6 x 6 e atribuir o valor 0 para os valores negativos encontrados fora das diagonais principal e secundaria.*/

import java.util.Random;

public class exercicio_009 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size = 6;
        final int max = 10;
        final int min = 0;
        int[][] matriz = new int[size][size];

        System.out.println("Informe uma matriz "+ size + " x " + size + ": ");

        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                int num = random.nextInt(min,max);
                matriz[i][j] = num * -1;
            }  
        }

        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                if (i != j && j != size - i - 1 && matriz[i][j] < 0){
                    
                    matriz[i][j] = 0;
                }  
            }  
        }

        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                System.out.print(matriz[i][j] + " ");
            } 
            System.out.println();
        }
    }
}
