/* Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação. */

import java.util.Scanner;

public class exercicio_005 {
    
    public static void main(String[] srgs){

        double populacao_A = 0;
        double populacao_B = 0;
        double taxa_cresc_A = 0;
        double taxa_cresc_B = 0;
        int ano = 0;

        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Informe a população A: ");
            populacao_A = scanner.nextDouble();
            System.out.println("Informe a população B: ");
            populacao_B = scanner.nextDouble();

            if(populacao_A > populacao_B){

                System.out.println("Erro: a população de A não pode ser menor que a de B, tente novamente.");
            }

        }while(populacao_A > populacao_B);

        do{
            System.out.println("Informe a taxa de crescimento A: ");
            taxa_cresc_A = scanner.nextDouble();
            System.out.println("Informe a taxa de crescimento B: ");
            taxa_cresc_B = scanner.nextDouble();

            if(taxa_cresc_A <= 0 || taxa_cresc_B <= 0 ){

                System.out.println("Erro: a taxa de crescimento de a e B devem ser diferente e maior que zero.");
            }

        }while(taxa_cresc_A <= 0 || taxa_cresc_B <= 0 );
        
        taxa_cresc_A = taxa_cresc_A/100;
        taxa_cresc_B = taxa_cresc_B/100;

        while(populacao_A < populacao_B){
            
            populacao_A = populacao_A*Math.pow(1 + taxa_cresc_A, ano++);
            populacao_B = populacao_B*Math.pow(1 + taxa_cresc_B, ano++);

        }

        System.out.println("Anos necessarios: " + ano);

        scanner.close();
    }
}
