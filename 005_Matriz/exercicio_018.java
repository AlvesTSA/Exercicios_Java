/*18. Leia uma matriz 5 x 5 e faça uma troca entre as diagonais superior e inferior. Escreva-a ao final.*/


import java.util.Random;

public class exercicio_018 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size = 5;
        final int max = 10;
        final int min = 0;
        int[][] matriz = new int[size][size];
        
        for (int i = 0; i < size; i++){
        
            for (int j = 0; j < size; j++){
                
                matriz[i][j] = random.nextInt(min,max);
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int temp = 0;
        
        for (int i = 0; i < size; i++){
            
            for (int j = i + 1; j < size; j++){
                
                temp = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = temp;
            }
        }

        System.out.println("Matriz invertida:");
        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
