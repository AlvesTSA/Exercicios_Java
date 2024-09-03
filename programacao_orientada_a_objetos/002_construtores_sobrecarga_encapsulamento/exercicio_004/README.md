<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
</head>
<body>
    <h1>Explicação sobre Construtores, Sobrecarga e Encapsulamento</h1>

<h2>Construtores</h2>
    <p>No código da classe <code>ContaBancaria</code>, um construtor é utilizado para inicializar os atributos da classe quando um objeto é criado. O construtor definido é:</p>
    <pre><code>public ContaBancaria(String titular, double saldo, double limite) {
    this.titular = titular;
    this.saldo = saldo;
    this.limite = limite;
}</code></pre>
    <p>Este construtor permite que, ao criar um objeto <code>ContaBancaria</code>, você defina o <code>titular</code>, o <code>saldo</code> inicial e o <code>limite</code> da conta. Por exemplo, no código principal:</p>
    <pre><code>ContaBancaria conta1 = new ContaBancaria("Maria Silva", 1000.00, 2000.00);</code></pre>
    <p>Aqui, um novo objeto <code>ContaBancaria</code> é criado com o titular "Maria Silva", saldo inicial de 1000.00 e limite de 2000.00.</p>

<h2>Sobrecarga de Construtores</h2>
    <p>O código fornecido não inclui sobrecarga de construtores. Somente um construtor foi definido, recebendo os parâmetros <code>titular</code>, <code>saldo</code> e <code>limite</code>. Caso houvesse mais construtores com diferentes conjuntos de parâmetros, poderíamos falar em sobrecarga de construtores.</p>

<h2>Encapsulamento</h2>
    <p>O encapsulamento é aplicado na classe <code>ContaBancaria</code> através do uso de modificadores de acesso <code>private</code> nos atributos <code>titular</code>, <code>saldo</code> e <code>limite</code>. Esses atributos só podem ser acessados ou modificados indiretamente através de métodos públicos <code>getter</code> e <code>setter</code>:</p>
    <pre><code>private String titular;
    private double saldo;
    private double limite;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
</code></pre>
    <p>Os métodos <code>getter</code> e <code>setter</code> permitem acessar e modificar os valores dos atributos de forma controlada, protegendo os dados internos da classe.</p>

<h2>Operações</h2>
    <p>A classe <code>ContaBancaria</code> também inclui métodos para realizar operações na conta, como depósito e saque. Esses métodos alteram o valor do saldo e retornam o novo saldo:</p>
    <pre><code>
    public double depositar(double valor) {
        System.out.println("Depósito: " + String.format("%.2f", valor));
        return this.saldo += valor;
    }

    public double sacar(double valor) {
        System.out.println("Saque: " + String.format("%.2f", valor));
        return this.saldo -= valor;
    }
</code></pre>
    <p>Esses métodos implementam a lógica necessária para manipular o saldo da conta, demonstrando a utilização de métodos dentro da classe para operações específicas.</p>

<h2>Elementos Relevantes</h2>
    <p>- <strong>Construtores:</strong> Um único construtor é usado para inicializar os atributos da classe <code>ContaBancaria</code> ao criar um novo objeto.</p>
    <p>- <strong>Sobrecarga:</strong> Não há sobrecarga de construtores presente no código.</p>
    <p>- <strong>Encapsulamento:</strong> O encapsulamento é garantido pela declaração <code>private</code> dos atributos e pelo uso de métodos <code>getter</code> e <code>setter</code> para acessar e modificar os valores.</p>
    <p>- <strong>Operações:</strong> Métodos específicos para depósito e saque são implementados, alterando o saldo da conta de forma controlada.</p>

<p>Em resumo, o código exemplifica o uso de construtores e encapsulamento, com métodos adicionais para operações de depósito e saque. Não há sobrecarga de construtores no código fornecido.</p>
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
