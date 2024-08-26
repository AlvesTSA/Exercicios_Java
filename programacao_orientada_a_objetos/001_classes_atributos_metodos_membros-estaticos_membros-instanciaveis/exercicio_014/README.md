
<body>
    <h1>Código com Membros Instanciáveis</h1>

 <h2>App.java</h2>
    <pre>
<code>package application;

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
        System.out.print("Curso: ");
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
        System.out.print("\nMédia: " + media);
        System.out.print("\nTotal de alunos: " + Aluno.total_alunos);
        sc.close();
    }
}
</code>
    </pre>

<h2>Aluno.java</h2>
    <pre>
<code>package entities;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    public int matricula;
    public String nome;
    public String curso;
    public List<Float> notas = new ArrayList<>();
    public static int total_alunos = 0;

    public void adicionar_nota(float nota) {
        System.out.println("Adicionando nota " + nota + "...");
        notas.add(nota);
    }

    public void remover_nota(float nota) {
        System.out.println("Removendo nota " + nota + "...");
        notas.remove(nota);
    }

    public float calcular_media() {
        float soma = 0;
        System.out.println("Calculando média... ");
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    @Override
    public String toString() {
        return "\nAluno: " + matricula + 
               "\nNome: " + nome + 
               "\nCurso: " + curso + 
               "\nNotas: " + notas;
    }
}
</code>
    </pre>



<h1>Código com Membros Estáticos</h1>

<h2>App.java</h2>
    <pre>
<code>package application;

import java.util.Scanner;
import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Matricula: ");
        Aluno.matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        Aluno.nome = sc.nextLine();
        System.out.print("Curso: ");
        Aluno.curso = sc.nextLine();
        System.out.println();
        System.out.println(Aluno.toStringStatic());
        Aluno.total_alunos++;

        Aluno.adicionar_nota(8.5F);
        Aluno.adicionar_nota(9.0F);
        Aluno.remover_nota(8.5F);
        Aluno.adicionar_nota(10.0F);
        float media = Aluno.calcular_media();

        System.out.println(Aluno.toStringStatic());
        System.out.print("\nMédia: " + media);
        System.out.print("\nTotal de alunos: " + Aluno.total_alunos);
        sc.close();
    }
}
</code>
    </pre>

<h2>Aluno.java</h2>
    <pre>
<code>package entities;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    public static int matricula;
    public static String nome;
    public static String curso;
    public static List<Float> notas = new ArrayList<>();
    public static int total_alunos = 0;

    public static void adicionar_nota(float nota) {
        System.out.println("Adicionando nota " + nota + "...");
        notas.add(nota);
    }

    public static void remover_nota(float nota) {
        System.out.println("Removendo nota " + nota + "...");
        notas.remove(nota);
    }

    public static float calcular_media() {
        float soma = 0;
        System.out.println("Calculando média... ");
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public static String toStringStatic() {
        return "\nAluno: " + matricula + 
               "\nNome: " + nome + 
               "\nCurso: " + curso + 
               "\nNotas: " + notas;
    }
}
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Aluno</code> pode representar um aluno específico com sua própria matrícula, nome, curso e notas. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
    <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos alunos sem interferência entre eles. Cada objeto <code>Aluno</code> pode ter seu próprio estado e comportamento.</li>
    <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
</ul>
<p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como alunos, a abordagem instanciável é geralmente mais apropriada.</p>



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
