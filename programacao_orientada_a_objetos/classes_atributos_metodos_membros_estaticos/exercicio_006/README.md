<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Estáticos</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import util.Calc;

    public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            double c = Calc.circumference(radius);
            double v = Calc.volume(radius);

            System.out.printf("Circumference: %.2f\n", c);
            System.out.printf("Volume: %.2f\n", v);
            System.out.printf("PI value: %.2f\n", Calc.PI);
            sc.close();
        }
    }
</code>
    </pre>

<h2>Calc.java</h2>
<pre>
<code>
    package util;

    public class Calc {

        public static final double PI = 3.141592653589793;

        public static double circumference(double radius) {
            return 2 * PI * radius;
        }

        public static double volume(double radius) {
            return (4 * PI * radius * radius * radius) / 3;
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A utilização de membros estáticos, como mostrado no código acima, é apropriada quando os métodos e constantes não dependem do estado de uma instância de classe. Aqui estão as razões:</p>
<ul>
    <li><b>Simplicidade:</b> Métodos e atributos estáticos são mais simples de acessar, pois não exigem a criação de uma instância da classe. Isso é útil para utilitários ou funções matemáticas que não dependem do estado do objeto.</li>
    <li><b>Memória:</b> Pode consumir menos memória, já que não há necessidade de criar múltiplas instâncias da classe.</li>
    <li><b>Desempenho:</b> Acesso mais rápido a métodos e atributos estáticos, pois são carregados uma vez e compartilhados entre todas as chamadas.</li>
</ul>
<p>Para o caso específico de cálculos matemáticos como circunferência e volume baseados em um raio, a abordagem estática é recomendada. Os métodos <code>circumference</code> e <code>volume</code> e a constante <code>PI</code> são independentes de qualquer estado de instância e, portanto, são bem modelados como membros estáticos.</p>
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
    import util.Calc;

    public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Calc calc = new Calc();

            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();

            double c = calc.circumference(radius);
            double v = calc.volume(radius);

            System.out.printf("Circumference: %.2f\n", c);
            System.out.printf("Volume: %.2f\n", v);
            System.out.printf("PI value: %.2f\n", calc.PI);
            sc.close();
        }
    }
</code>
    </pre>

<h2>Calc.java</h2>
<pre>
<code>
    package util;

    public class Calc {

        public final double PI = 3.141592653589793;

        public double circumference(double radius) {
            return 2 * PI * radius;
        }

        public double volume(double radius) {
            return (4 * PI * radius * radius * radius) / 3;
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A utilização de membros instanciáveis pode ser justificada em situações onde o estado específico de uma instância é relevante. No entanto, para funções matemáticas puras como as fornecidas no exemplo, a abordagem estática é geralmente mais adequada. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Membros instanciáveis fazem sentido quando diferentes instâncias podem ter estados diferentes. No caso de funções matemáticas universais, isso não é necessário.</li>
    <li><b>Uso de Constantes:</b> Constantes como <code>PI</code> são universais e não dependem de uma instância específica.</li>
    <li><b>Praticidade:</b> Métodos estáticos são práticos para utilitários, pois podem ser chamados sem a necessidade de criar um objeto.</li>
</ul>
<p>Portanto, para cálculos matemáticos que não dependem do estado, a abordagem com membros estáticos é geralmente mais recomendada.</p>
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
