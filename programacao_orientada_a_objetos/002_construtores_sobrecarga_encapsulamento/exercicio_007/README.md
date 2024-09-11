<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
</head>
<body>
    <h1>Explicação sobre Construtores, Sobrecarga e Encapsulamento</h1>

<h2>Construtores</h2>
    <p>O código da classe <code>Evento</code> utiliza um construtor para inicializar seus atributos quando um objeto é criado. O construtor definido na classe é:</p>
<pre><code>
    public Evento(String nome, LocalDate data, String local, String pacote, double valorBase) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.pacote = pacote;
        this.valorBase = valorBase;
    }
</code></pre>
    <p>Esse construtor permite criar um objeto <code>Evento</code> passando o <code>nome</code>, a <code>data</code>, o <code>local</code>, o <code>pacote</code> e o <code>valorBase</code>. Por exemplo, no código principal:</p>
    <pre><code>Evento evento1 = new Evento(nome, date, local, pacote, 2000.00);</code></pre>
    <p>Isso cria um evento com as informações fornecidas.</p>

<h2>Sobrecarga de Métodos</h2>
    <p>A sobrecarga de métodos é demonstrada pelos diferentes métodos <code>calcularValorTotal</code> na classe <code>Evento</code>. Esses métodos possuem a mesma funcionalidade de calcular o valor total do evento, mas aceitam diferentes números de parâmetros:</p>
    <ul>
        <li><strong>calcularValorTotal()</strong>: Calcula o valor total baseado apenas no <code>valorBase</code>.</li>
        <li><strong>calcularValorTotal(double valorBuffer)</strong>: Calcula o valor total com base no <code>valorBase</code> e em um valor adicional de buffer.</li>
        <li><strong>calcularValorTotal(double valorBuffer, double valorDJ)</strong>: Calcula o valor total com base no <code>valorBase</code>, no buffer e no valor para DJ.</li>
    </ul>
    <p>A sobrecarga de métodos permite a utilização de diferentes assinaturas, fornecendo flexibilidade nas operações com diferentes combinações de parâmetros.</p>

<h2>Encapsulamento</h2>
    <p>O encapsulamento é implementado na classe <code>Evento</code> através do uso de modificadores de acesso <code>private</code> para seus atributos. Isso significa que esses atributos só podem ser acessados ou modificados por meio de métodos públicos <code>getter</code> e <code>setter</code>:</p>
<pre><code>
    private String nome;
    private String local;
    private LocalDate data;
    private String pacote;
    private double valorBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        if (valorBase < 0) {
            throw new IllegalArgumentException("O valor base não pode ser negativo.");
        }
        this.valorBase = valorBase;
    }
</code></pre>
    <p>Esses métodos protegem o acesso aos dados internos, garantindo que os valores sejam acessados e alterados de maneira controlada.</p>

<h2>Operações</h2>
    <p>Os métodos <code>calcularValorTotal</code> na classe <code>Evento</code> permitem calcular o valor total do evento com base em diferentes condições:</p>
<pre><code>
    public double calcularValorTotal() {
        return valorBase + valorBase * 0.10;
    }

    public double calcularValorTotal(double valorBuffer) {
        return valorBase + valorBuffer + valorBase * 0.10;
    }

    public double calcularValorTotal(double valorBuffer, double valorDJ) {
        return valorBase + valorDJ + valorBuffer + valorBase * 0.10;
    }
</code></pre>
    <p>Esses métodos sobrecarregados permitem calcular o valor total de um evento com diferentes combinações de parâmetros adicionais, como buffers e taxas de DJ.</p>

<h2>Elementos Relevantes</h2>
    <p>- <strong>Construtores:</strong> O construtor permite inicializar os atributos do evento ao criar um novo objeto, garantindo que todas as informações necessárias sejam fornecidas.</p>
    <p>- <strong>Sobrecarga de Métodos:</strong> A sobrecarga de métodos permite o cálculo do valor total do evento de diferentes maneiras, dependendo dos parâmetros fornecidos.</p>
    <p>- <strong>Encapsulamento:</strong> Os atributos são encapsulados e acessados de forma controlada por meio de métodos <code>getter</code> e <code>setter</code>.</p>
    <p>- <strong>Operações:</strong> Os métodos <code>calcularValorTotal</code> fornecem uma maneira flexível de calcular o valor total de um evento com diferentes condições.</p>

<p>Em resumo, o código demonstra o uso de construtores, sobrecarga de métodos e encapsulamento, além de operações flexíveis para calcular o valor total de eventos.</p>
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
