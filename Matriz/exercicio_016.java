/* 16- Criando um tabuleiro de Jogo da Velha
Crie um tabuleiro de jogo da velha, usando uma matrizes de caracteres (char) 3×3, onde o usuário pede o número da linha (1 até 3) e o da coluna (1 até 3). A cada vez que o usuário entrar com esses dados, colocar um ‘X’ ou ‘O’ no local selecionado.*/

import java.util.Scanner;

public class exercicio_016 {
    
    public static void main(String[] args) {
        
        final int size = 3;
        char[][] matriz = new char[size][size];
        int i,j = 0;

        Scanner scanner = new Scanner(System.in);

        for (int z = 0; z < size*size; z++){
        
            do{
               System.out.print("Informe a linha: ");
                i = scanner.nextInt();
                System.out.print("Informe a coluna: ");
                j = scanner.nextInt();

                if ((i < 1 || i > size) || (j < 1 || j > size)){
                    
                    System.out.println("ERRO: Valor invalido, informe de 1 a " + size);
                }
                if (matriz[i-1][j-1] == 'X' || matriz[i-1][j-1] == 'O'){
                
                    System.out.println("ERRO: Esse espaco ja foi preenchido.");
                }
            
            } while ((i < 1 || i > size) || (j < 1 || j > size) || matriz[i-1][j-1] == 'X' || matriz[i-1][j-1] == 'O');

            if (z % 2 == 0){

                matriz[i-1][j-1] = 'X';
            }
            else{

                matriz[i-1][j-1] = 'O';
            }
        }

        System.out.println("Resultado do jogo:");
        for (i = 0; i < size; i++){
            
            for (j = 0; j < size; j++){
                
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();

    }
}
