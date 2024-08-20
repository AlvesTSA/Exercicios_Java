<!DOCTYPE html>
<html>
<head>
    <title>Código com Membros Instanciáveis</title>
</head>
<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
    <pre>
<code>package application;

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
        sc.nextLine(); // Limpar o buffer
        System.out.print("Descrição: ");
        tarefa1.descricao = sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data_a = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        tarefa1.data_conclusao = LocalDate.parse(data_a, formatter);

        System.out.println("Status: " + (tarefa1.concluida ? "Concluída" : "Não Concluída"));
        System.out.println();

        tarefa1.concluir();

        System.out.println("Status: " + (tarefa1.concluida ? "Concluída" : "Não Concluída"));
        System.out.println("Total de tarefas concluídas: " + Tarefa.total_tarefas_concluidas);
        System.out.println();

        tarefa1.reabrir();

        System.out.println("Status: " + (tarefa1.concluida ? "Concluída" : "Não Concluída"));
        System.out.println("Total de tarefas concluídas: " + Tarefa.total_tarefas_concluidas);

        sc.close();
    }
}
</code>
    </pre>

<h2>Tarefa.java</h2>
    <pre>
<code>package entities;

import java.time.LocalDate;

public class Tarefa {

    public int id;
    public String descricao;
    public LocalDate data_conclusao;
    public boolean concluida = false;
    public static int total_tarefas_concluidas;

    public void concluir() {
        System.out.println("Concluindo tarefa...");
        concluida = true;
        total_tarefas_concluidas++;
    }

    public void reabrir() {
        System.out.println("Reabrindo tarefa...");
        concluida = false;
        total_tarefas_concluidas--;
    }
}
</code>
    </pre>
</body>
</html>


<!DOCTYPE html>
<html>
<head>
    <title>Código com Membros Estáticos</title>
</head>
<body>
    <h1>Código com Membros Estáticos</h1>

<h2>App.java</h2>
    <pre>
<code>package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tarefa: ");
        Tarefa.id = sc.nextInt();
        sc.nextLine(); // Limpar o buffer
        System.out.print("Descrição: ");
        Tarefa.descricao = sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data_a = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Tarefa.data_conclusao = LocalDate.parse(data_a, formatter);

        System.out.println("Status: " + (Tarefa.concluida ? "Concluída" : "Não Concluída"));
        System.out.println();

        Tarefa.concluir();

        System.out.println("Status: " + (Tarefa.concluida ? "Concluída" : "Não Concluída"));
        System.out.println("Total de tarefas concluídas: " + Tarefa.total_tarefas_concluidas);
        System.out.println();

        Tarefa.reabrir();

        System.out.println("Status: " + (Tarefa.concluida ? "Concluída" : "Não Concluída"));
        System.out.println("Total de tarefas concluídas: " + Tarefa.total_tarefas_concluidas);

        sc.close();
    }
}
</code>
    </pre>

<h2>Tarefa.java</h2>
    <pre>
<code>package entities;

import java.time.LocalDate;

public class Tarefa {

    public static int id;
    public static String descricao;
    public static LocalDate data_conclusao;
    public static boolean concluida = false;
    public static int total_tarefas_concluidas;

    public static void concluir() {
        System.out.println("Concluindo tarefa...");
        concluida = true;
        total_tarefas_concluidas++;
    }

    public static void reabrir() {
        System.out.println("Reabrindo tarefa...");
        concluida = false;
        total_tarefas_concluidas--;
    }
}
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
    <p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
    <ul>
        <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Tarefa</code> pode representar uma tarefa específica com seu próprio id, descrição, data de conclusão e status de conclusão. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
        <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplas tarefas sem interferência entre elas. Cada objeto <code>Tarefa</code> pode ter seu próprio estado e comportamento.</li>
        <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
    </ul>
    <p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como tarefas, a abordagem instanciável é geralmente mais apropriada.</p>
</body>
</html>



## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
