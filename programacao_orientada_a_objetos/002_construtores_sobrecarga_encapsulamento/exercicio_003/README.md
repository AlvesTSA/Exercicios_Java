<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
</head>
<body>
    <h1>Explicação sobre Construtores, Sobrecarga e Encapsulamento</h1>

<h2>Construtores</h2>
    <p>No código da classe <code>Carro</code>, são utilizados dois construtores, que são métodos especiais chamados automaticamente quando um objeto da classe é criado. Os construtores definidos são:</p>
    <pre><code>public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
}

public Carro(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = 2024;
}</code></pre>
    <p>O primeiro construtor permite criar um objeto <code>Carro</code> especificando a <code>marca</code>, o <code>modelo</code> e o <code>ano</code> do carro. O segundo construtor permite criar um objeto apenas com a <code>marca</code> e o <code>modelo</code>, definindo automaticamente o <code>ano</code> como 2024.</p>

<h2>Sobrecarga de Construtores</h2>
    <p>A sobrecarga de construtores é claramente demonstrada no código da classe <code>Carro</code>. Isso é feito através da existência de dois construtores com diferentes parâmetros:</p>
    <ul>
        <li>O primeiro construtor recebe três parâmetros: <code>marca</code>, <code>modelo</code> e <code>ano</code>.</li>
        <li>O segundo construtor recebe dois parâmetros: <code>marca</code> e <code>modelo</code>, e define o <code>ano</code> como um valor padrão de 2024.</li>
    </ul>
    <p>A sobrecarga permite a criação de objetos <code>Carro</code> de maneiras diferentes, dependendo das informações disponíveis no momento da criação do objeto.</p>

<h2>Encapsulamento</h2>
    <p>O encapsulamento é implementado através do uso de modificadores de acesso <code>private</code> para os atributos <code>marca</code>, <code>modelo</code> e <code>ano</code>. Esses atributos só podem ser acessados ou modificados indiretamente através de métodos <code>getter</code> e <code>setter</code>, garantindo a proteção dos dados:</p>
    <pre><code>private String marca;
private String modelo;
private int ano;

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public int getAno() {
    return ano;
}

public void setAno(int ano) {
    this.ano = ano;
}</code></pre>
    <p>Os métodos <code>getter</code> e <code>setter</code> permitem acessar e modificar os valores dos atributos de forma controlada, respeitando as regras de encapsulamento.</p>

<h2>Elementos Relevantes</h2>
    <p>- <strong>Construtores:</strong> Dois construtores são usados, um com três parâmetros e outro com dois, demonstrando a sobrecarga de construtores.</p>
    <p>- <strong>Sobrecarga:</strong> A sobrecarga de construtores está presente, permitindo a criação de objetos <code>Carro</code> com diferentes informações.</p>
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
