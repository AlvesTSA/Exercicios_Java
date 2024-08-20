package entities;

import java.time.LocalDate;

public class Tarefa {

    public int id;
    public String descricao;
    public LocalDate data_conclusao;
    public boolean concluida = false;
    public static int total_tarefas_concluidas;

    public void concluir(){

        System.out.println("Concluindo tarefa...");
        concluida = true;
        total_tarefas_concluidas++;
    }

    public void reabrir(){

        System.out.println("Reabrindo tarefa...");
        concluida = false;
        total_tarefas_concluidas--;

    }
}