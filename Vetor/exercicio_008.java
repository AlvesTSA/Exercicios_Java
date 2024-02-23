/*8. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.*/

import java.util.Scanner;

public class exercicio_008 {
    
    public static void main(String[] args){

        int[] idade = new int[5];
        float[] altura = new float[5];
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < altura.length; i++) {
            
            System.out.println("Informe a idade da pessoa " + (i + 1) + ": ");
            idade[i] = scanner.nextInt();
            System.out.println("Informe a altura da pessoa " + (i + 1) + ": ");
            altura[i] = scanner.nextFloat();
        }

        for (int i = 4; i >= 0; i--) {
            
            System.out.println("Idade da pessoa " + (i + 1) + ": " + idade[i]);
            
            System.out.println("Altura da pessoa " + (i + 1) + ": " + altura[i]);
            
        }
        
        scanner.close();
    }
}
