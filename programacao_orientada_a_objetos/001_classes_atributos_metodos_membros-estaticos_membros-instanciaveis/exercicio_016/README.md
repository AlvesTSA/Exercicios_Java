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

import entities.Projetos;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Projetos projeto1 = new Projetos();

        System.out.print("Projeto: ");
        projeto1.codigo = sc.nextInt();
        System.out.print("Nome: ");
        sc.nextLine();  // Clear the buffer
        projeto1.nome = sc.nextLine();
        System.out.print("Data de início (yyyy-MM-dd): ");
        String data_i = sc.nextLine();
        System.out.print("Data de término (yyyy-MM-dd): ");
        String data_f = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        projeto1.data_inicio = LocalDate.parse(data_i, formatter);
        projeto1.data_termino = LocalDate.parse(data_f, formatter);
        Projetos.total_projetos++;
        System.out.println();
        int duracao = projeto1.calcular_duracao();
        System.out.println("Duração: " + duracao + " dias");
        System.out.println();
        boolean status = projeto1.verificar_ativo("2023-06-10");

        if (!status) {
            System.out.println("Ativo: Não");
        } else {
            System.out.println("Ativo: Sim");
        }

        System.out.println();
        System.out.println("Total de projetos: " + Projetos.total_projetos);

        sc.close();
    }
}
</code>
    </pre>

 <h2>Projetos.java</h2>
    <pre>
<code>package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Projetos {

    public int codigo;
    public String nome;
    public LocalDate data_inicio;
    public LocalDate data_termino;
    public static int total_projetos = 0;

    public int calcular_duracao() {
        System.out.println("Calculando duração...");
        return (int) ChronoUnit.DAYS.between(data_inicio, data_termino);
    }

    public boolean verificar_ativo(String data_atual) {
        System.out.println("Verificando se está ativo em " + data_atual);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(data_atual, formatter);
        return !data.isBefore(data_inicio) && !data.isAfter(data_termino);
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

import entities.Projetos;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Projeto: ");
        Projetos.codigo = sc.nextInt();
        System.out.print("Nome: ");
        sc.nextLine();  // Clear the buffer
        Projetos.nome = sc.nextLine();
        System.out.print("Data de início (yyyy-MM-dd): ");
        String data_i = sc.nextLine();
        System.out.print("Data de término (yyyy-MM-dd): ");
        String data_f = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Projetos.data_inicio = LocalDate.parse(data_i, formatter);
        Projetos.data_termino = LocalDate.parse(data_f, formatter);
        Projetos.total_projetos++;
        System.out.println();
        int duracao = Projetos.calcular_duracao();
        System.out.println("Duração: " + duracao + " dias");
        System.out.println();
        boolean status = Projetos.verificar_ativo("2023-06-10");

        if (!status) {
            System.out.println("Ativo: Não");
        } else {
            System.out.println("Ativo: Sim");
        }

        System.out.println();
        System.out.println("Total de projetos: " + Projetos.total_projetos);

        sc.close();
    }
}
</code>
    </pre>

 <h2>Projetos.java</h2>
    <pre>
<code>package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Projetos {

    public static int codigo;
    public static String nome;
    public static LocalDate data_inicio;
    public static LocalDate data_termino;
    public static int total_projetos = 0;

    public static int calcular_duracao() {
        System.out.println("Calculando duração...");
        return (int) ChronoUnit.DAYS.between(data_inicio, data_termino);
    }

    public static boolean verificar_ativo(String data_atual) {
        System.out.println("Verificando se está ativo em " + data_atual);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(data_atual, formatter);
        return !data.isBefore(data_inicio) && !data.isAfter(data_termino);
    }
}
</code>
    </pre>

  <h2>Qual Opção é Recomendada e Por Quê?</h2>
    <p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
    <ul>
        <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Projetos</code> pode representar um projeto específico com seu próprio código, nome, data de início e término. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
        <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos projetos sem interferência entre eles. Cada objeto <code>Projetos</code> pode ter seu próprio estado e comportamento.</li>
        <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
    </ul>
    <p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como projetos, a abordagem instanciável é geralmente mais apropriada.</p>
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
