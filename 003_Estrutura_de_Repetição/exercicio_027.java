/*27. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos. */

import java.util.Scanner;

public class exercicio_027 {
    
    public static void main(String[] args){

        int turmas = 0;
        int aluno = 0;
        int soma = 0;
        int media = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantas turmas deseja calcular: ");
        turmas = scanner.nextInt();

        for(int i = 1; i <= turmas; i++){

            do {
                System.out.println("Informe a quantidade de aluno da turma " + i + ":");
                aluno = scanner.nextInt();

                if (aluno > 40) {
                    System.out.println("Erro: a turma deve ter ate 40 alunos.");
                }
                
            } while (aluno > 40);
            
            soma += aluno;
        }
        media = soma/turmas;

        System.out.println("media aluno por turma: " + media);

        scanner.close();
    }
}
