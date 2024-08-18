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
import entities.Pedido;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Pedido pedido1 = new Pedido();

        System.out.print("Pedido: ");
        pedido1.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data_a = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        pedido1.data = LocalDate.parse(data_a, formatter);

        System.out.println("Status: " + (pedido1.pago ? "Pago" : "Não Pago"));
        System.out.println();

        pedido1.registrar_pagamento();

        System.out.println("Status: " + (pedido1.pago ? "Pago" : "Não Pago"));
        System.out.println("Total de pedidos: " + Pedido.total_pedidos);
        System.out.println();

        pedido1.cancelar_pedido();

        sc.close();
    }
}
</code>
    </pre>

 <h2>Pedido.java</h2>
    <pre>
<code>package entities;

import java.time.LocalDate;

public class Pedido {

    public int numero;
    public LocalDate data;
    public float valor_total;
    public boolean pago = false;
    public static int total_pedidos = 0;

    public void registrar_pagamento() {
        System.out.println("Registrando pagamento...");
        pago = true;
        total_pedidos++;
    }

    public void cancelar_pedido() {
        System.out.println("Cancelando pedido...");

        if (pago) {
            System.out.println("Pedido já pago, não pode ser cancelado");
        } else {
            System.out.println("Pedido cancelado com sucesso.");

            if (total_pedidos > 0) {
                total_pedidos--;
            }
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
import entities.Pedido;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Pedido: ");
        Pedido.numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String data_a = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Pedido.data = LocalDate.parse(data_a, formatter);

        System.out.println("Status: " + (Pedido.pago ? "Pago" : "Não Pago"));
        System.out.println();

        Pedido.registrar_pagamento();

        System.out.println("Status: " + (Pedido.pago ? "Pago" : "Não Pago"));
        System.out.println("Total de pedidos: " + Pedido.total_pedidos);
        System.out.println();

        Pedido.cancelar_pedido();

        sc.close();
    }
}
</code>
    </pre>

<h2>Pedido.java</h2>
    <pre>
<code>package entities;

import java.time.LocalDate;

public class Pedido {

    public static int numero;
    public static LocalDate data;
    public static float valor_total;
    public static boolean pago = false;
    public static int total_pedidos = 0;

    public static void registrar_pagamento() {
        System.out.println("Registrando pagamento...");
        pago = true;
        total_pedidos++;
    }

    public static void cancelar_pedido() {
        System.out.println("Cancelando pedido...");

        if (pago) {
            System.out.println("Pedido já pago, não pode ser cancelado");
        } else {
            System.out.println("Pedido cancelado com sucesso.");

            if (total_pedidos > 0) {
                total_pedidos--;
            }
        }
    }
}
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
    <p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
    <ul>
        <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Pedido</code> pode representar um pedido específico com seu próprio número, data e status de pagamento. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
        <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos pedidos sem interferência entre eles. Cada objeto <code>Pedido</code> pode ter seu próprio estado e comportamento.</li>
        <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
    </ul>
    <p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como pedidos, a abordagem instanciável é geralmente mais apropriada.</p>
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
