/*1. Leia uma matriz 3 x 3 e escreva a localização (linha e a coluna) do maior valor.*/

import java.util.Scanner;

public class exercicio_001 {
    public static void main(String[] args) {
        
        final int size = 3;
        int maior = 0;
        int[][] matriz = new int[size][size];
        int linha = 0;
        int coluna = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma matriz " + size + " x " + size + ": ");

        for(int i = 0; i < size; i++){
            
            for(int j = 0; j < size; j++){
                
                matriz[i][j] = scanner.nextInt();

                if(matriz[i][j] > maior){
                    
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha + "\n" + "Coluna: " + coluna);

        scanner.close();
    }
}