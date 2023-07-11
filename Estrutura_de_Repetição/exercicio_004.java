/* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento. */

import java.util.Scanner;

public class exercicio_004 {
    
    public static void main(String[] args) {
        
        double populacao_A = 80000;
        double populacao_B = 200000;
        double taxa_cresc_A = 0.03;
        double taxa_cresc_B = 0.015;
        int ano = 0;

        Scanner scanner = new Scanner(System.in);

        while(populacao_A < populacao_B){

            populacao_A = populacao_A*Math.pow(1 + taxa_cresc_A, ano++);
            populacao_B = populacao_B*Math.pow(1 + taxa_cresc_B, ano++);
        }
        System.out.println("Anos necessarios: " + ano);

        scanner.close();
    }
}
