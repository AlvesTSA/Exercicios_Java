/*13. Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).*/

import java.util.Scanner;

public class exercicio_013 {
    
    public static void main(String[] args){

        float[] temp = new float[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "junho", "julho", "Agosto", "Setermbro", "Outubro", "Novembro", "Dezembro" };
        float media = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < temp.length; i++) {
            
            System.out.println("Informe a temperatura media do mes de " + meses[i] + ": ");
            temp[i] = scanner.nextFloat();

            media += temp[i];

        }

        media /= temp.length;
        System.out.println("Meses com temperatura acima da media anual\n");

        for (int i = 0; i < meses.length; i++) {
            
            if (temp[i] > media) {
                
                System.out.println((i + 1) + " - " + meses[i] + ": " + temp[i] + " °C");
            }
        }

        scanner.close();
    }
}
