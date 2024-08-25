<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Explicação sobre Construtores, Sobrecarga e Encapsulamento</title>
</head>
<body>
    <h1>Explicação sobre Construtores, Sobrecarga e Encapsulamento</h1>

<h2>Construtores</h2>
    <p>O construtor é um método especial da classe que é chamado automaticamente quando um objeto dessa classe é criado. No código, a classe <code>Pessoa</code> possui um construtor definido pela linha:</p>
    <pre><code>public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
}</code></pre>
    <p>Este construtor permite que, ao criar um novo objeto <code>Pessoa</code>, você passe diretamente o nome e a idade da pessoa, como mostrado na linha:</p>
    <pre><code>Pessoa p1 = new Pessoa(nome, idade);</code></pre>
    <p>Ao fazer isso, o construtor inicializa os atributos <code>nome</code> e <code>idade</code> do objeto <code>Pessoa</code> com os valores fornecidos. Assim, o construtor garante que todo objeto da classe <code>Pessoa</code> seja criado com um nome e uma idade definidos.</p>

<h2>Sobrecarga de Construtores</h2>
    <p>Sobrecarga de construtores ocorre quando você tem mais de um construtor na mesma classe, mas com diferentes parâmetros. No código fornecido, não há sobrecarga de construtores, pois há apenas um construtor definido para a classe <code>Pessoa</code>. Se houvesse, seria possível criar objetos <code>Pessoa</code> de diferentes maneiras, dependendo do número ou tipo de parâmetros passados.</p>

<h2>Encapsulamento</h2>
    <p>O encapsulamento é uma das principais características da programação orientada a objetos e refere-se à prática de proteger os dados dentro de uma classe, restringindo o acesso direto a esses dados. No código, o encapsulamento é implementado da seguinte forma:</p>
    <pre><code>private String nome;
private int idade;</code></pre>
    <p>Os atributos <code>nome</code> e <code>idade</code> são declarados como <code>private</code>, o que significa que eles não podem ser acessados diretamente de fora da classe <code>Pessoa</code>. Para acessar esses atributos, são fornecidos métodos <code>getter</code>:</p>
    <pre><code>public String getNome(){
    return nome;
}

public int getIdade(){
    return idade;
}</code></pre>
    <p>Esses métodos permitem acessar os valores dos atributos <code>nome</code> e <code>idade</code> de forma controlada. Dessa maneira, o encapsulamento garante que os dados internos de um objeto estejam protegidos de acessos ou modificações indevidas.</p>

<h2>Elementos Ausentes</h2>
    <p>- <strong>Sobrecarga:</strong> Como mencionado anteriormente, não há sobrecarga de construtores ou métodos no código fornecido.</p>
    <p>- <strong>Encapsulamento de forma mais abrangente:</strong> Embora existam métodos <code>getter</code>, não há métodos <code>setter</code>, o que impede a modificação dos atributos após a criação do objeto. Isso pode ser uma decisão deliberada, dependendo da lógica do programa.</p>

<p>Em resumo, o código exemplifica bem o uso de construtores e encapsulamento, mas não demonstra a sobrecarga.</p>
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
