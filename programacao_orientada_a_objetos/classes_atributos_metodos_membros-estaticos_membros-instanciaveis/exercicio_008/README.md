<!DOCTYPE html>
<html>
<head>
    <title>Explicação sobre Membros Estáticos vs Instanciáveis</title>
</head>
<body>
<h1>Membros Estáticos vs Instanciáveis</h1>
    
<h2>Vantagens e Desvantagens de Cada Abordagem</h2>
    
<h3>Membros Instanciáveis (Não Estáticos)</h3>
<h4>Vantagens:</h4>
<ul>
    <li>Encapsulamento e Independência: Cada instância da classe <code>ContaBancaria</code> pode representar uma conta bancária diferente, com seu próprio número, titular e saldo. Isso é mais alinhado com o conceito de Programação Orientada a Objetos (POO), onde objetos representam entidades independentes.</li>
    <li>Flexibilidade: Permite criar várias contas bancárias sem interferência entre elas. Cada objeto pode ter seu próprio estado e comportamento.</li>
    <li>Reusabilidade e Manutenção: Métodos e atributos não estáticos tornam o código mais modular e fácil de manter. Alterações em uma instância não afetam outras.</li>
</ul>

<h4>Desvantagens:</h4>
<ul>
    <li>Complexidade: Pode ser um pouco mais complexo, especialmente para iniciantes, devido à necessidade de criar e gerenciar instâncias.</li>
</ul>

<h3>Membros Estáticos</h3>
<h4>Vantagens:</h4>
<ul>
    <li>Simplicidade: Métodos e atributos estáticos são mais simples de acessar, pois não exigem a criação de uma instância. Isso pode ser útil para utilitários ou funções que não dependem do estado do objeto.</li>
    <li>Memória: Pode consumir menos memória, já que não há necessidade de criar múltiplas instâncias da classe. No entanto, isso depende do contexto e da quantidade de dados que cada instância pode conter.</li>
</ul>

<h4>Desvantagens:</h4>
<ul>
    <li>Falta de Encapsulamento: Membros estáticos são compartilhados por todas as partes do programa, o que significa que alterações em um lugar podem ter efeitos colaterais inesperados em outro. Isso pode levar a problemas de sincronização e bugs difíceis de rastrear.</li>
    <li>Não Representa Bem Entidades Individuais: Usar membros estáticos para algo que deveria ser instanciado (como uma conta bancária) vai contra os princípios da POO. Não permite criar várias contas com estados independentes.</li>
    <li>Dificuldade de Teste: Testar código com muitos membros estáticos pode ser mais difícil, pois os testes podem interferir uns nos outros devido ao compartilhamento de estado.</li>
</ul>

<h3>Qual é Melhor?</h3>
<p>Para o caso específico de uma classe <code>ContaBancaria</code>, a abordagem instanciável é a mais apropriada. Isso porque cada conta bancária deve ter seu próprio estado (número da conta, nome do titular, saldo), e o uso de membros não estáticos permite isso de maneira clara e alinhada aos princípios da POO.</p>

<p>Aqui está um resumo das razões:</p>
<ul>
    <li>Representação Realista: Cada conta bancária é uma entidade independente, e isso é melhor representado por instâncias de uma classe.</li>
    <li>Escalabilidade: Permite criar e gerenciar múltiplas contas bancárias sem conflitos.</li>
    <li>Manutenibilidade: Facilita a manutenção e expansão do código no futuro.</li>
</ul>

<h3>Código Recomendado com Membros Instanciáveis</h3>
<h4>App.java</h4>
<pre><code>package application;

import java.util.Scanner;
import entities.ContaBancaria;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Informe o número da conta: ");
        conta.numero_conta = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha
        System.out.print("Informe o nome do titular: ");
        conta.nome_titular = sc.nextLine();
        System.out.print("Informe o saldo inicial: ");
        conta.saldo = sc.nextFloat();
        System.out.println(conta);
        System.out.println();

        System.out.print("Informe o valor a ser depositado: ");
        float valor = sc.nextFloat();
        conta.depositar(valor);

        System.out.print("Informe o valor a ser sacado: ");
        valor = sc.nextFloat();
        conta.sacar(valor);

        float saldo = conta.consultar_saldo();
        System.out.printf("Saldo atual: %.2f\n\n", saldo);

        System.out.print("Informe o valor a ser sacado: ");
        valor = sc.nextFloat();
        conta.sacar(valor);
        sc.close();
    }
}</code></pre>
    
<h4>ContaBancaria.java</h4>
<pre><code>package entities;

public class ContaBancaria {

    public int numero_conta;
    public String nome_titular;
    public float saldo;
    public static final float taxa_juros = 0.05F;

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.printf("Novo saldo: %.2f\n\n", saldo);
    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("ERRO: Saldo insuficiente!");
            System.out.printf("Saldo atual: %.2f\n\n", saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.printf("Novo saldo: %.2f\n\n", saldo);
        }
    }

    public float consultar_saldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("Conta criada com sucesso!\n") +
               String.format("Número da Conta: %d\n", numero_conta) +
               String.format("Nome do Titular: %s\n", nome_titular) +
               String.format("Saldo Inicial: %.2f\n", saldo) +
               String.format("Taxa de Juros: %f\n\n", ContaBancaria.taxa_juros);
    }
}</code></pre>

<p>Essa abordagem torna o código mais alinhado com os princípios de POO, permitindo a criação e gestão de várias contas bancárias de forma independente.</p>
</body>
</html>

<!DOCTYPE html>
<html>
<head>
    <title>Código com Membros Estáticos</title>
</head>
<body>
    <h3>Código com Membros Estáticos</h3>

<h4>App.java</h4>
<pre>
<code>package application;

import java.util.Scanner;
import entities.ContaBancaria;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        ContaBancaria.numero_conta = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha
        System.out.print("Informe o nome do titular: ");
        ContaBancaria.nome_titular = sc.nextLine();
        System.out.print("Informe o saldo inicial: ");
        ContaBancaria.saldo = sc.nextFloat();
        System.out.println(ContaBancaria.toStringStatic());
        System.out.println();

        System.out.print("Informe o valor a ser depositado: ");
        float valor = sc.nextFloat();
        ContaBancaria.depositar(valor);

        System.out.print("Informe o valor a ser sacado: ");
        valor = sc.nextFloat();
        ContaBancaria.sacar(valor);

        float saldo = ContaBancaria.consultar_saldo();
        System.out.printf("Saldo atual: %.2f\n\n", saldo);

        System.out.print("Informe o valor a ser sacado: ");
        valor = sc.nextFloat();
        ContaBancaria.sacar(valor);
        sc.close();
    }
}
</code>
    </pre>

<h4>ContaBancaria.java</h4>
<pre>
<code>package entities;

public class ContaBancaria {

    public static int numero_conta;
    public static String nome_titular;
    public static float saldo;
    public static final float taxa_juros = 0.05F;

    public static void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.printf("Novo saldo: %.2f\n\n", saldo);
    }

    public static void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("ERRO: Saldo insuficiente!");
            System.out.printf("Saldo atual: %.2f\n\n", saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.printf("Novo saldo: %.2f\n\n", saldo);
        }
    }

    public static float consultar_saldo() {
        return saldo;
    }

    public static String toStringStatic() {
        return String.format("Conta criada com sucesso!\n") +
               String.format("Número da Conta: %d\n", numero_conta) +
               String.format("Nome do Titular: %s\n", nome_titular) +
               String.format("Saldo Inicial: %.2f\n", saldo) +
               String.format("Taxa de Juros: %f\n\n", ContaBancaria.taxa_juros);
    }
}
</code>
    </pre>
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
