/*12. Leia uma matriz 4 x 4 e verifique se é palíndromo, isto é, sua leitura a partir de qualquer direção sempre apresentara a mesma seqüência.EX.                 SATOR
                    AREPO
                    TENET
                    OPERA
                    ROTAS
                        */

import java.util.Scanner;

public class exercicio_012 {
    
    public static void main(String[] args) {
        
        final int size = 4;
        char[][] matriz = new char[size][size];
        boolean polindromo = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma matriz tipo char " + size + " x " + size + ": ");

        for (int i = 0; i < size; i++){
      
            for (int j = 0; j < size; j++){
            
                matriz[i][j] = scanner.next().charAt(0);

            }
        }

        for (int i = 0; i < size; i++){
      
            for (int j = 0; j < size; j++){
            
                if (matriz[i][j] != matriz[(size-1) - i][(size - 1) - j]){
                    
                    polindromo = false;

                    break;
                }
            }
        }

        if (polindromo){
      
            System.out.print("Matriz:\n");

            for (int i = 0; i < size; i++){
        
                for (int j = 0; j < size; j++){
                    
                    System.out.print(matriz[i][j] + " ");
                }

                System.out.println();
            }
            System.out.println("A matriz e um polindromo");
        }
        else{

            System.out.println("Matriz:");

            for (int i = 0; i < size; i++){
        
                for (int j = 0; j < size; j++){
                
                    System.out.print(matriz[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println("A matriz nao e polidromo");
        }
        scanner.close();
    }
}
