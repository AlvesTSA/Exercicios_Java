package application;

import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.print("Matricula: ");
        aluno1.matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        aluno1.nome = sc.nextLine();
        System.out.print("curso: ");
        aluno1.curso = sc.nextLine();
        System.out.println();
        System.out.println(aluno1);
        Aluno.total_alunos++;

        aluno1.adicionar_nota(8.5F);
        aluno1.adicionar_nota(9.0F);
        aluno1.remover_nota(8.5F);
        aluno1.adicionar_nota(10.0F);
        float media = aluno1.calcular_media();

        System.out.println(aluno1);
        System.out.print("\nMedia: " + media);
        System.out.print("\nTotal de alunos: " + Aluno.total_alunos);
        sc.close();
    }
}
