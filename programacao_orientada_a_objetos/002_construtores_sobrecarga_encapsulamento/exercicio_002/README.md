<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
</head>
<body>
    <h1>Explicação sobre Construtores, Sobrecarga e Encapsulamento</h1>

<h2>Construtores</h2>
    <p>O código da classe <code>Produto</code> demonstra a utilização de dois construtores, que são métodos especiais chamados automaticamente quando um objeto da classe é criado. Os construtores definidos no código são:</p>
    <pre><code>public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}

public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = 5;
}</code></pre>
    <p>O primeiro construtor permite criar um objeto <code>Produto</code> especificando o <code>nome</code>, <code>preço</code> e <code>quantidade</code>. O segundo construtor permite criar um objeto apenas com <code>nome</code> e <code>preço</code>, definindo automaticamente a <code>quantidade</code> como 5.</p>

<h2>Sobrecarga de Construtores</h2>
    <p>A sobrecarga de construtores está claramente presente no código da classe <code>Produto</code>. Isso é demonstrado pela existência de dois construtores com diferentes parâmetros:</p>
    <ul>
        <li>O primeiro construtor recebe três parâmetros: <code>nome</code>, <code>preco</code> e <code>quantidade</code>.</li>
        <li>O segundo construtor recebe dois parâmetros: <code>nome</code> e <code>preco</code>, e define a <code>quantidade</code> como um valor padrão de 5.</li>
    </ul>
    <p>A sobrecarga permite criar objetos <code>Produto</code> de formas diferentes, dependendo das informações disponíveis no momento da criação do objeto.</p>

<h2>Encapsulamento</h2>
    <p>O encapsulamento é implementado através do uso de modificadores de acesso <code>private</code> para os atributos <code>nome</code>, <code>preco</code> e <code>quantidade</code>. Esses atributos só podem ser acessados ou modificados indiretamente através de métodos <code>getter</code> e <code>setter</code>, garantindo proteção dos dados:</p>
    <pre><code>private String nome;
private double preco;
private int quantidade;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}</code></pre>
    <p>Os métodos <code>getter</code> e <code>setter</code> permitem acessar e modificar os valores dos atributos de forma controlada, respeitando as regras de encapsulamento.</p>

<h2>Elementos Relevantes</h2>
    <p>- <strong>Construtores:</strong> Dois construtores são usados, um com três parâmetros e outro com dois, demonstrando a sobrecarga de construtores.</p>
    <p>- <strong>Sobrecarga:</strong> A sobrecarga de construtores está presente, permitindo a criação de objetos <code>Produto</code> com diferentes informações.</p>
    <p>- <strong>Encapsulamento:</strong> O encapsulamento é garantido pela declaração <code>private</code> dos atributos e pelo uso de métodos <code>getter</code> e <code>setter</code>.</p>

<p>Em resumo, o código exemplifica o uso de construtores, sobrecarga de construtores e encapsulamento de forma eficaz, garantindo flexibilidade na criação de objetos e proteção dos dados.</p>
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
