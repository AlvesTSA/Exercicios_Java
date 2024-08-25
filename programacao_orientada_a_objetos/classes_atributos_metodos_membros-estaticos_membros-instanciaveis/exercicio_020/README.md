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
        System.out.print("Número de alunos: ");
        turma1.numero_alunos = sc.nextInt();
        System.out.println();

        turma1.adicionar_aluno();
        System.out.println();
        turma1.remover_aluno();
        System.out.println();

        sc.close();
    }
}
</code>
    </pre>

<h2>Turma.java</h2>
    <pre>
<code>package entities;

public class Turma {

    public int codigo;
    public String nome;
    public String professor;
    public int numero_alunos;
    public static int total_turmas = 0;

    public void adicionar_aluno() {
        System.out.println("Adicionando aluno...");
        numero_alunos++;
        System.out.println("Número de alunos: " + numero_alunos);
    }

    public void remover_aluno() {
        System.out.println("Removendo aluno...");
        numero_alunos--;
        System.out.println("Número de alunos: " + numero_alunos);
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

import java.util.Scanner;
import entities.Turma;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Turma: ");
        Turma.codigo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        Turma.nome = sc.nextLine();
        System.out.print("Professor: ");
        Turma.professor = sc.nextLine();
        System.out.print("Número de alunos: ");
        Turma.numero_alunos = sc.nextInt();
        System.out.println();

        Turma.adicionar_aluno();
        System.out.println();
        Turma.remover_aluno();
        System.out.println();

        sc.close();
    }
}
</code>
    </pre>

<h2>Turma.java</h2>
    <pre>
<code>package entities;

public class Turma {

    public static int codigo;
    public static String nome;
    public static String professor;
    public static int numero_alunos;
    public static int total_turmas = 0;

    public static void adicionar_aluno() {
        System.out.println("Adicionando aluno...");
        numero_alunos++;
        System.out.println("Número de alunos: " + numero_alunos);
    }

    public static void remover_aluno() {
        System.out.println("Removendo aluno...");
        numero_alunos--;
        System.out.println("Número de alunos: " + numero_alunos);
    }
}
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
    <p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
    <ul>
        <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Turma</code> pode representar uma turma específica com seu próprio código, nome, professor e número de alunos. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
        <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplas turmas sem interferência entre elas. Cada objeto <code>Turma</code> pode ter seu próprio estado e comportamento.</li>
        <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
    </ul>
    <p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como turmas, a abordagem instanciável é geralmente mais apropriada.</p>
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
