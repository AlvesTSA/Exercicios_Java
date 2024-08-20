package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Tarefa tarefa1 = new Tarefa();
        System.out.print("Tarefa: ");
        tarefa1.id = sc.nextInt();
        System.out.print("Descricao: ");
        tarefa1.descricao = sc.nextLine();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data_a = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        tarefa1.data_conclusao = LocalDate.parse(data_a, formatter);
        System.out.println("Status: " + (tarefa1.concluida ? "Concluida" : "Nao Concluida"));
        System.out.println();
        tarefa1.concluir();
        System.out.println("Status: " + (tarefa1.concluida ? "Concluida" : "Nao Concluida"));
        System.out.println("Total de tarefas concluídas: " + Tarefa.total_tarefas_concluidas);
        System.out.println();
        tarefa1.reabrir();
        System.out.println("Status: " + (tarefa1.concluida ? "Concluida" : "Nao Concluida"));
        System.out.println("Total de tarefas concluídas: " + Tarefa.total_tarefas_concluidas);

        sc.close();
    }
}