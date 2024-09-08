<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
</head>
<body>
    <h1>Explicação sobre Construtores, Sobrecarga e Encapsulamento</h1>

<h2>Construtores</h2>
    <p>O código da classe <code>Funcionario</code> demonstra o uso de múltiplos construtores para inicializar objetos da classe de diferentes maneiras. Os construtores fornecidos são:</p>
    <pre><code>
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }
</code></pre>
    <p>Esses construtores permitem criar objetos <code>Funcionario</code> com diferentes combinações de parâmetros. Por exemplo, você pode criar um funcionário com <code>nome</code>, <code>cargo</code> e <code>salário</code>, ou apenas com <code>nome</code> e <code>cargo</code>, ou ainda somente com o <code>nome</code>.</p>

<h2>Sobrecarga de Construtores</h2>
    <p>A sobrecarga de construtores é demonstrada pela existência de três construtores diferentes na classe <code>Funcionario</code>. Cada construtor possui uma assinatura distinta, permitindo flexibilidade na criação de objetos:</p>
    <ul>
        <li><strong>Construtor 1:</strong> Recebe <code>nome</code>, <code>cargo</code> e <code>salário</code>.</li>
        <li><strong>Construtor 2:</strong> Recebe <code>nome</code> e <code>cargo</code>, e assume um salário padrão.</li>
        <li><strong>Construtor 3:</strong> Recebe apenas o <code>nome</code>, com valores padrões para cargo e salário.</li>
    </ul>
    <p>Essa sobrecarga permite criar funcionários com diferentes níveis de detalhe, dependendo das informações disponíveis.</p>

<h2>Encapsulamento</h2>
    <p>O encapsulamento é implementado através da declaração de atributos como <code>private</code>, o que significa que eles só podem ser acessados ou modificados através de métodos <code>getter</code> e <code>setter</code>:</p>
    <pre><code>
    private String nome;
    private String cargo = "Desenvolvedor";
    private double salario = 7000.00;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
</code></pre>
    <p>Esses métodos permitem acessar e modificar os atributos de forma controlada, respeitando o princípio de encapsulamento. Isso protege os dados internos e fornece uma interface controlada para trabalhar com os atributos da classe.</p>

<h2>Operações</h2>
    <p>Além de gerenciar os atributos, a classe <code>Funcionario</code> também contém o método <code>ajustarSalario</code>, que ajusta o salário de um funcionário com base em um percentual fornecido:</p>
    <pre><code>
    public void ajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf(" - Novo salário: %.2f (%.0f%% de aumento)", salario, percentual);
    }
</code></pre>
    <p>Esse método calcula o novo salário de acordo com o percentual de aumento e imprime o resultado, garantindo que o valor seja ajustado de maneira precisa e controlada.</p>

<h2>Elementos Relevantes</h2>
    <p>- <strong>Construtores:</strong> Três construtores são usados para inicializar objetos <code>Funcionario</code> com diferentes combinações de atributos, demonstrando a sobrecarga de construtores.</p>
    <p>- <strong>Sobrecarga:</strong> A sobrecarga de construtores é aplicada para permitir a criação de objetos com diferentes níveis de detalhes.</p>
    <p>- <strong>Encapsulamento:</strong> Os atributos da classe são encapsulados por meio de modificadores de acesso <code>private</code> e métodos <code>getter</code> e <code>setter</code> para controle de acesso.</p>
    <p>- <strong>Operações:</strong> O método <code>ajustarSalario</code> demonstra a capacidade de modificar o salário de maneira calculada e controlada, baseado em um percentual de aumento.</p>

<p>Em resumo, o código exemplifica o uso de construtores sobrecarregados, encapsulamento e operações com métodos que ajustam o salário de um funcionário. Isso proporciona flexibilidade, proteção de dados e funcionalidades claras na classe <code>Funcionario</code>.</p>
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
