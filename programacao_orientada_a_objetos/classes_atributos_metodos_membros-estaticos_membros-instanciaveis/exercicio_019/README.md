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
import entities.Compra;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Compra compra1 = new Compra();

        System.out.print("Compra: ");
        compra1.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        compra1.data = LocalDate.parse(data, formatter);
        System.out.print("Valor total: ");
        compra1.valor_total = sc.nextFloat();

        System.out.println("Status: " + (compra1.entregue ? "Entregue" : "Não Entregue"));
        System.out.println();

        compra1.registrar_entrega();

        System.out.println("Status: " + (compra1.entregue ? "Entregue" : "Não Entregue"));
        System.out.println("Total de compras: " + Compra.total_compras);
        System.out.println();

        compra1.cancelar_compra();

        sc.close();
    }
}
</code>
    </pre>

<h2>Compra.java</h2>
    <pre>
<code>package entities;

import java.time.LocalDate;

public class Compra {

    public int numero;
    public LocalDate data;
    public boolean entregue = false;
    public float valor_total;
    public static int total_compras = 0;

    public void registrar_entrega() {
        System.out.println("Registrando entrega...");
        entregue = true;
        total_compras++;
    }

    public void cancelar_compra() {
        System.out.println("Cancelando compra...");
        if (entregue) {
            System.out.println("Compra já entregue, não pode ser cancelada");
        } else {
            System.out.println("Compra cancelada...");
            entregue = false;
            total_compras--;
        }
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
import entities.Compra;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Compra: ");
        Compra.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Compra.data = LocalDate.parse(data, formatter);
        System.out.print("Valor total: ");
        Compra.valor_total = sc.nextFloat();

        System.out.println("Status: " + (Compra.entregue ? "Entregue" : "Não Entregue"));
        System.out.println();

        Compra.registrar_entrega();

        System.out.println("Status: " + (Compra.entregue ? "Entregue" : "Não Entregue"));
        System.out.println("Total de compras: " + Compra.total_compras);
        System.out.println();

        Compra.cancelar_compra();

        sc.close();
    }
}
</code>
    </pre>

<h2>Compra.java</h2>
    <pre>
<code>package entities;

import java.time.LocalDate;

public class Compra {

    public static int numero;
    public static LocalDate data;
    public static boolean entregue = false;
    public static float valor_total;
    public static int total_compras = 0;

    public static void registrar_entrega() {
        System.out.println("Registrando entrega...");
        entregue = true;
        total_compras++;
    }

    public static void cancelar_compra() {
        System.out.println("Cancelando compra...");
        if (entregue) {
            System.out.println("Compra já entregue, não pode ser cancelada");
        } else {
            System.out.println("Compra cancelada...");
            entregue = false;
            total_compras--;
        }
    }
}
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
    <p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
    <ul>
        <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Compra</code> pode representar uma compra específica com seu próprio número, data, valor total e status de entrega. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
        <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplas compras sem interferência entre elas. Cada objeto <code>Compra</code> pode ter seu próprio estado e comportamento.</li>
        <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
    </ul>
    <p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como compras, a abordagem instanciável é geralmente mais apropriada.</p>
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
