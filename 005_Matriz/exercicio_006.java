/*6. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva ao final a matriz obtida.*/


public class exercicio_006 {
    
    public static void main(String[] args) {
        
        final int size = 5;
        int[][] matriz = new int[size][size];

        for (int i = 0; i < size; i++){
        
            for (int y = 0; y < size; y++){
                
                if(i == y){

                    matriz[i][y] = 1;
                }
                else{

                    matriz[i][y] = 0;
                }
            }
        }

        System.out.println("Matriz resultante:");
        
        for (int i = 0; i < size; i++){
            
            for (int y = 0; y < size; y++){
                
                System.out.print(matriz[i][y] + " ");
            }

            System.out.println();
        }
    }
}
