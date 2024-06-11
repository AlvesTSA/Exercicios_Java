<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Estáticos</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import util.CurrencyConverter;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("What is the dollar price? ");
            double dollar_price = sc.nextDouble();
            System.out.print("How many dollars will be bought? ");
            double value = sc.nextDouble();

            System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.calcConverter(value, dollar_price));
            sc.close();
        }
    }
</code>
    </pre>

<h2>CurrencyConverter.java</h2>
<pre>
<code>
    package util;

    public class CurrencyConverter {

        public static double calcConverter(double value, double dollar_price) {
            return ((value * (6 / 100.0)) + value) * dollar_price;
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A utilização de membros estáticos, como mostrado no código acima, é apropriada quando os métodos não dependem do estado de uma instância de classe. Aqui estão as razões:</p>
<ul>
    <li><b>Simplicidade:</b> Métodos estáticos são mais simples de acessar, pois não exigem a criação de uma instância da classe. Isso é útil para funções utilitárias como a conversão de moeda.</li>
    <li><b>Memória:</b> Pode consumir menos memória, já que não há necessidade de criar múltiplas instâncias da classe.</li>
    <li><b>Desempenho:</b> Acesso mais rápido a métodos estáticos, pois são carregados uma vez e compartilhados entre todas as chamadas.</li>
</ul>
<p>Para o caso específico de conversão de moeda, a abordagem estática é recomendada. O método <code>calcConverter</code> é independente de qualquer estado de instância e, portanto, é bem modelado como um membro estático.</p>
</body>
</html>


<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import util.CurrencyConverter;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            CurrencyConverter converter = new CurrencyConverter();

            System.out.print("What is the dollar price? ");
            double dollar_price = sc.nextDouble();
            System.out.print("How many dollars will be bought? ");
            double value = sc.nextDouble();

            System.out.printf("Amount to be paid in reais = %.2f", converter.calcConverter(value, dollar_price));
            sc.close();
        }
    }
</code>
    </pre>

<h2>CurrencyConverter.java</h2>
<pre>
<code>
    package util;

    public class CurrencyConverter {

        public double calcConverter(double value, double dollar_price) {
            return ((value * (6 / 100.0)) + value) * dollar_price;
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A utilização de membros instanciáveis pode ser justificada em situações onde o estado específico de uma instância é relevante. No entanto, para funções utilitárias como a conversão de moeda, a abordagem estática é geralmente mais adequada. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Membros instanciáveis fazem sentido quando diferentes instâncias podem ter estados diferentes. No caso de uma função de conversão de moeda, isso não é necessário.</li>
    <li><b>Praticidade:</b> Métodos estáticos são práticos para utilitários, pois podem ser chamados sem a necessidade de criar um objeto.</li>
    <li><b>Uso de Constantes:</b> Constantes e métodos utilitários não dependem de uma instância específica e podem ser compartilhados entre todas as partes do código.</li>
</ul>
<p>Portanto, para funções utilitárias que não dependem do estado, como a conversão de moeda, a abordagem com membros estáticos é geralmente mais recomendada.</p>
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
