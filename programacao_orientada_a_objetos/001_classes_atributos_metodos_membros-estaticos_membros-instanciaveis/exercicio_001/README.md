<!DOCTYPE html>
<html>
<body>
<h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>package application;

    import java.util.Scanner;
    import entities.Triangulo;

    public class App {
        public static void main(String[] args) {
            Triangulo x, y;
            Scanner sc = new Scanner(System.in);

            x = new Triangulo();
            y = new Triangulo();

            System.out.println("Informe os lados do triangulo x:");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();

            System.out.println("Informe os lados do triangulo y:");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();

            double areaX = x.area();
            double areaY = y.area();

            System.out.printf("A área do triangulo x: %.2f\n", areaX);
            System.out.printf("A área do triangulo y: %.2f\n", areaY);

            if (areaX > areaY) {
                System.out.println("Maior área: triangulo X");
            } else {
                System.out.println("Maior área: triangulo Y");
            }

            sc.close();
        }
    }
</code>
</pre>

<h2>Triangulo.java</h2>
<pre>
<code>package entities;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
</code>
    </pre>
</body>
</html>

<!DOCTYPE html>
<html>


<body>
<h1>Código com Membros Estáticos</h1>

<h2>App.java</h2>
<pre>
<code>  
package application;

    import java.util.Scanner;
    import entities.Triangulo;

    public class App {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe os lados do triangulo x:");
            double xA = sc.nextDouble();
            double xB = sc.nextDouble();
            double xC = sc.nextDouble();

            System.out.println("Informe os lados do triangulo y:");
            double yA = sc.nextDouble();
            double yB = sc.nextDouble();
            double yC = sc.nextDouble();

            double areaX = Triangulo.area(xA, xB, xC);
            double areaY = Triangulo.area(yA, yB, yC);

            System.out.printf("A área do triangulo x: %.2f\n", areaX);
            System.out.printf("A área do triangulo y: %.2f\n", areaY);

            if (areaX > areaY) {
                System.out.println("Maior área: triangulo X");
            } else {
                System.out.println("Maior área: triangulo Y");
            }

            sc.close();
        }
    }
</code>
</pre>

<h2>Triangulo.java</h2>
    <pre>
<code>
package entities;

    public class Triangulo {
        public static double area(double a, double b, double c) {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
