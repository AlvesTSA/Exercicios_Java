package application;

import java.util.Scanner;

import entities.Turma;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Turma turma1 = new Turma();

        System.out.print("Turma: ");
        turma1.codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        turma1.nome = sc.nextLine();
        System.out.print("Professor: ");
        turma1.professor = sc.nextLine();
        System.out.print("Mumero de alunos: ");
        turma1.numero_alunos = sc.nextInt();
        System.out.println();
        turma1.adicionar_aluno();
        System.out.println();
        turma1.remover_aluno();
        System.out.println();
        sc.close();
    }
}
