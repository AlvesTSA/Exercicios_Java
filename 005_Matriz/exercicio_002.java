/*2. Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui.*/

import java.util.Random;

public class exercicio_002 {
    
    public static void main(String[] args){

        Random random = new Random();
        final int size = 6;
        final int min = 1;
        final int max = 30;
        int count = 0;
        int[][] matriz = new int[size][size];

        System.out.println("Informe uma matriz: ");

        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                matriz[i][j] = random.nextInt(min,max);

                if (matriz[i][j] > 10){
                    
                    count++;
                } 
            }
        }

        System.out.println("Matriz lida: ");
        
        for (int i = 0; i < size; i++){
            
            for (int j = 0; j < size; j++){
                
                System.out.print(matriz[i][j] + " ");
                
            } 
            System.out.println();
        }

        System.out.println("Existem " + count + " valores maiores que 10"); 

    }
}
