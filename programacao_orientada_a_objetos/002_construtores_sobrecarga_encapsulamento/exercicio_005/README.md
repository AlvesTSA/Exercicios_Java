<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
</head>
<body>
    <h1>Explicação sobre Construtores, Sobrecarga e Encapsulamento</h1>

<h2>Construtores</h2>
    <p>No código da classe <code>Calculadora</code>, o construtor padrão (implícito) é utilizado. Isso significa que não há um construtor explícito declarado na classe, mas o Java fornece um construtor padrão quando nenhum é definido. Ele permite criar instâncias da classe como neste trecho:</p>
    <pre><code>Calculadora calc1 = new Calculadora();</code></pre>
    <p>Este código cria um novo objeto <code>Calculadora</code> sem parâmetros, utilizando o construtor padrão.</p>

<h2>Sobrecarga de Métodos</h2>
    <p>A sobrecarga de métodos está claramente presente no código da classe <code>Calculadora</code>. Isso é demonstrado pela existência de três versões do método <code>soma</code> com diferentes assinaturas:</p>
    <ul>
        <li><code>soma(int a, int b)</code>: Soma dois números inteiros.</li>
        <li><code>soma(int a, int b, int c)</code>: Soma três números inteiros.</li>
        <li><code>soma(double a, double b)</code>: Soma dois números do tipo <code>double</code>.</li>
    </ul>
    <p>A sobrecarga de métodos permite que o mesmo nome de método seja utilizado para diferentes operações, dependendo dos tipos e do número de parâmetros passados.</p>

<h2>Encapsulamento</h2>
    <p>O encapsulamento é implementado na classe <code>Calculadora</code> através do atributo <code>resultado</code>, que é declarado como <code>private</code>. Isso significa que ele só pode ser acessado ou modificado indiretamente por métodos públicos:</p>
    <pre><code>private double resultado;</code></pre>
    <p>Para acessar o valor de <code>resultado</code>, a classe fornece o método <code>getResultado</code>:</p>
    <pre><code>public double getResultado() {
    return this.resultado;
}</code></pre>
    <p>Esse método permite obter o valor armazenado em <code>resultado</code>, garantindo que o atributo esteja protegido contra acessos diretos de fora da classe.</p>

<h2>Operações</h2>
    <p>A classe <code>Calculadora</code> implementa métodos para somar valores inteiros e de ponto flutuante (<code>double</code>). Esses métodos realizam a operação de soma e armazenam o resultado no atributo <code>resultado</code>:</p>
    <pre><code>
    public int soma(int a, int b) {
        System.out.println("Soma de dois inteiros: ");
        int soma = a + b;
        this.resultado = soma;
        return soma;
    }

    public int soma(int a, int b, int c) {
        System.out.println("Soma de três inteiros: ");
        int soma = a + b + c;
        this.resultado = soma;
        return soma;
    }

    public double soma(double a, double b) {
        System.out.println("Soma de dois doubles: ");
        double soma = a + b;
        this.resultado = soma;
        return soma;
    }
</code></pre>
    <p>Esses métodos permitem realizar somas com diferentes tipos de entradas e armazenam o valor final no atributo <code>resultado</code>.</p>

<h2>Elementos Relevantes</h2>
    <p>- <strong>Construtores:</strong> O código utiliza o construtor padrão, fornecido implicitamente pelo Java.</p>
    <p>- <strong>Sobrecarga de métodos:</strong> A classe <code>Calculadora</code> demonstra sobrecarga de métodos através de várias versões do método <code>soma</code>, que aceitam diferentes tipos e quantidades de parâmetros.</p>
    <p>- <strong>Encapsulamento:</strong> O atributo <code>resultado</code> é encapsulado e só pode ser acessado por meio do método <code>getResultado</code>.</p>

<p>Em resumo, o código demonstra o uso de sobrecarga de métodos, encapsulamento e a utilização do construtor padrão. A classe é eficiente ao permitir somas de diferentes tipos e armazenar o resultado de forma protegida.</p>
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
