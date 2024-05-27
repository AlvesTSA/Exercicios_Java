/*5. Faça uma função que recebe por parâmetro o tempo de duração de uma fábrica expressa em segundos e retorna também por parâmetro esse tempo em horas, minutos e segundos.*/

import java.util.Scanner;

public class exercicio_005
{
    public static void main(String[] args)
    {
        int tEmSeg = 0;
        int[] tempo = {0,0,0,}; 
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o tempo em segundos: ");
        tEmSeg = scan.nextInt();

        converteTempo(tEmSeg, tempo);

        System.out.printf("Horas: %d\n", tempo[0]);
        System.out.printf("Minutos: %d\n", tempo[1]);
        System.out.printf("Segundos: %d\n", tempo[2]);

        scan.close();
    }
    static void converteTempo(int tempoEmSegundos, int[] tempo)
    {
        tempo[0] = tempoEmSegundos / 3600;  // Calcula o número de horas
        tempo[1] = (tempoEmSegundos % 3600) / 60;  // Calcula o número de minutos
        tempo[2] = tempoEmSegundos % 60;  // Calcula os segundos restantes
    }
}