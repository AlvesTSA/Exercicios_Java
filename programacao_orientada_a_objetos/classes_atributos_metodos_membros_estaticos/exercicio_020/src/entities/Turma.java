package entities;

public class Turma {

    public int codigo;
    public String nome;
    public String professor;
    public int numero_alunos;
    public static int total_turmas = 0;


    public void adicionar_aluno(){

        System.out.println("Adicionando aluno...");
        numero_alunos++;
        System.out.println("Numero de alunos: " + numero_alunos);
    }

    public void remover_aluno(){

        System.out.println("Removendo aluno...");
        numero_alunos--;
        System.out.println("Numero de alunos: " + numero_alunos);
    }
}