
<h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
 <pre>
<code>package application;

import java.util.Scanner;
import entities.ItemEstoque;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ItemEstoque ite = new ItemEstoque();

        System.out.print("Item: ");
        ite.nome = sc.nextLine();
        System.out.print("Codigo: ");
        ite.codigo = sc.nextInt();
        System.out.print("Preco unitario: ");
        ite.preco_unitario = sc.nextFloat();
        System.out.print("Quantidade: ");
        ite.quantidade = sc.nextInt();
        System.out.print("Total em Estoque: " + ite.quantidade);
        System.out.println();
        ite.adicionar_itens(5);
        System.out.println();
        ite.remover_itens(3);

        sc.close();
    }
}
</code>
    </pre>

<h2>ItemEstoque.java</h2>
<pre>
<code>package entities;

public class ItemEstoque {

    public int codigo;
    public String nome;
    public int quantidade;
    public float preco_unitario;
    public static int total_itens_estoque = 0;

    public void adicionar_itens(int quantidade) {
        this.quantidade += quantidade;
        total_itens_estoque += quantidade;
        System.out.println("Adicionando " + quantidade + " itens...");
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Total em Estoque: " + total_itens_estoque);
    }

    public void remover_itens(int quantidade) {
        this.quantidade -= quantidade;
        total_itens_estoque -= quantidade;
        System.out.println("Removendo " + quantidade + " itens...");
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Total em Estoque: " + total_itens_estoque);
    }
}
</code>
    </pre>


<body>
    <h1>Código com Membros Estáticos</h1>

<h2>App.java</h2>
    <pre>
<code>package application;

import java.util.Scanner;
import entities.ItemEstoque;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Item: ");
        ItemEstoque.nome = sc.nextLine();
        System.out.print("Codigo: ");
        ItemEstoque.codigo = sc.nextInt();
        System.out.print("Preco unitario: ");
        ItemEstoque.preco_unitario = sc.nextFloat();
        System.out.print("Quantidade: ");
        ItemEstoque.quantidade = sc.nextInt();
        System.out.print("Total em Estoque: " + ItemEstoque.quantidade);
        System.out.println();
        ItemEstoque.adicionar_itens(5);
        System.out.println();
        ItemEstoque.remover_itens(3);

        sc.close();
    }
}
</code>
    </pre>

<h2>ItemEstoque.java</h2>
    <pre>
<code>package entities;

public class ItemEstoque {

    public static int codigo;
    public static String nome;
    public static int quantidade;
    public static float preco_unitario;
    public static int total_itens_estoque = 0;

    public static void adicionar_itens(int quantidade) {
        ItemEstoque.quantidade += quantidade;
        total_itens_estoque += quantidade;
        System.out.println("Adicionando " + quantidade + " itens...");
        System.out.println("Quantidade: " + ItemEstoque.quantidade);
        System.out.println("Total em Estoque: " + total_itens_estoque);
    }

    public static void remover_itens(int quantidade) {
        ItemEstoque.quantidade -= quantidade;
        total_itens_estoque -= quantidade;
        System.out.println("Removendo " + quantidade + " itens...");
        System.out.println("Quantidade: " + ItemEstoque.quantidade);
        System.out.println("Total em Estoque: " + total_itens_estoque);
    }
}
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
    <ul>
        <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>ItemEstoque</code> pode representar um item específico com seu próprio código, nome, quantidade e preço unitário. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
        <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos itens de estoque sem interferência entre eles. Cada objeto <code>ItemEstoque</code> pode ter seu próprio estado e comportamento.</li>
        <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
    </ul>
    <p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como itens de estoque, a abordagem instanciável é geralmente mais apropriada.</p>

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
