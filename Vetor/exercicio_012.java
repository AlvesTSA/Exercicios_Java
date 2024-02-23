/*12. Foram anotadas as idades e alturas de 10 alunos. Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.*/

import java.util.Scanner;

public class exercicio_012 {
    
    public static void main(String[] args){

        int[] idade = new int[10];
        float[] altura = new float[10];
        float media = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < altura.length; i++) {
            
            System.out.println("Informe a idade do aluno " + (i + 1) + ": ");
            idade[i] = scanner.nextInt();
            System.out.println("Informe a altura do aluno " + (i + 1) + ": ");
            altura[i] = scanner.nextFloat();
            
            media += altura[i];
        }

        media /= altura.length;
        int count = 0;

        for (int i = 0; i < altura.length; i++) {
            
            if (idade[i] > 13 && altura[i] < media) {
                
                count++;
            }
        }

        System.out.println("alunos com mais de 13 anos com altura inferior a media: " + count);

        scanner.close();
    }
}
