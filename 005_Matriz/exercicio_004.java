/*4. Leia uma matriz 4 x 4 e troque os valores da 1ª.linha pelos da 4ª.coluna, vice-e-versa. Escrever ao final a matriz obtida */


import java.util.Random;

public class exercicio_004 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size = 4;
        final int max = 9;
        final int min = 1;
        int[][] matriz = new int[size][size];
        int temp = 0;

        for (int i = 0; i < size; i++){
        
            for (int j = 0; j < size; j++){
            
                matriz[i][j] = random.nextInt(min,max);
            }
        }
        
        System.out.println("Matriz lida: ");

        for (int i = 0; i < size; i++){
        
            for (int j = 0; j < size; j++){
                
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++){
        
            temp = matriz[0][i];
            matriz[0][i] = matriz[i][3];
            matriz[i][3] = temp;
        }

        System.out.println("Matriz invertida: ");
    
        for (int i = 0; i < size; i++){
        
            for (int j = 0; j < size; j++){
            
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
