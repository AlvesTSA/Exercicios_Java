/*11. Leia uma matriz 100 x 10 que se refere respostas de 10 questões de múltipla escolha, referentes a 100 alunos. Leia também um vetor de 10 posições contendo o gabarito de respostas que podem ser a, b, c ou d. Seu programa deverá comparar as respostas de cada candidato com o gabarito e emitir um vetor Resultado, contendo a pontuação correspondente.*/
import java.util.Random;

public class exercicio_011 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        final int size_l = 100;
        final int size_c = 10;
        char[] respostas = { 'a', 'b', 'c', 'd' };
        int size = respostas.length;
        char[][] matriz = new char[size_l][size_c];
        char[] gabarito = new char[size_c];
        int[] resultado = new int[size_l];
        int[] count_acerto = new int[size_l];

        //Geração do gabarito
        for (int i = 0; i < size_c; i++){
            
            gabarito[i] = respostas[random.nextInt(0,size)];

        }

        for (int i = 0; i < size_l; i++){
            
            System.out.println("Respostas do Aluno " + (i+1) + ": ");
        
            for (int j = 0; j < size_c; j++){
                
                matriz[i][j] = respostas[random.nextInt(0,size)];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < size_l; i++){
            
            for (int j = 0; j < size_c; j++){
                
                if (matriz[i][j] == gabarito[j]){
                    
                    resultado[i] += 10;
                    count_acerto[i]++;
                }
                else{
                    
                    resultado[i] += 0;
                }
            }
        }

        System.out.println("\nGabarito: ");
 
        for (int i = 0; i < size_c; i++){
            
            System.out.print(gabarito[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < size_l; i++){

            System.out.println("Resultado do aluno " + (i+1) + ": " + count_acerto[i] + " acertos e " + resultado[i] + " pontos.");
            
        }
    }
}
