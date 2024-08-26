/*26. Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato. */
import java.util.Scanner;

public class exercicio_026 {
    
    public static void main(String[] args){

        int eleitor = 0;
        int candidato = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numeros de eleitores: ");
        eleitor = scanner.nextInt();

        for(int i = 1; i <= eleitor; i++){

            System.out.println("Informe qual candidato deseja votar [1] [2] [3]");
            candidato = scanner.nextInt();

            switch (candidato) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                default:

                    System.out.println("Erro: vote 1, 2 ou 3");
                    break;
            }
        }

        System.out.println("Candidato 1: " + candidato1 + " Votos");
        System.out.println("Candidato 2: " + candidato1 + " Votos");
        System.out.println("Candidato 3: " + candidato1 + " Votos");

        scanner.close();
    }
}
