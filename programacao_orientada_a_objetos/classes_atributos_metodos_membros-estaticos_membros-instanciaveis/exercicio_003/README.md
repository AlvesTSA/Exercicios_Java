<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import entities.Rectangle;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Rectangle rectangle = new Rectangle();

            System.out.println("Enter rectangle width and height: ");
            rectangle.width = sc.nextDouble();
            rectangle.height = sc.nextDouble();

            System.out.println(rectangle);

            sc.close();
        }
    }
</code>
    </pre>

<h2>Rectangle.java</h2>
<pre>
<code>
    package entities;

    public class Rectangle {

        public double width;
        public double height;

        public double area() {
            return width * height;
        }

        public double perimeter() {
            return 2 * width + 2 * height;
        }

        public double diagonal() {
            return Math.sqrt(height * height + width * width);
        }

        @Override
        public String toString() {
            return String.format("AREA = %.2f\n", area()) +
                String.format("PERIMETER = %.2f\n", perimeter()) +
                String.format("DIAGONAL = %.2f\n", diagonal());
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
    import entities.Rectangle;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter rectangle width and height: ");
            Rectangle.width = sc.nextDouble();
            Rectangle.height = sc.nextDouble();

            System.out.println(Rectangle.toStringStatic());

            sc.close();
        }
    }
</code>
    </pre>

<h2>Rectangle.java</h2>
<pre>
<code>
    package entities;

    public class Rectangle {

        public static double width;
        public static double height;

        public static double area() {
            return width * height;
        }

        public static double perimeter() {
            return 2 * width + 2 * height;
        }

        public static double diagonal() {
            return Math.sqrt(height * height + width * width);
        }

        public static String toStringStatic() {
            return String.format("AREA = %.2f\n", area()) +
                String.format("PERIMETER = %.2f\n", perimeter()) +
                String.format("DIAGONAL = %.2f\n", diagonal());
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Rectangle</code> pode representar um retângulo específico com sua própria largura e altura. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
    <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos retângulos sem interferência entre eles. Cada objeto <code>Rectangle</code> pode ter seu próprio estado e comportamento.</li>
    <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
</ul>
<p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como retângulos, a abordagem instanciável é geralmente mais apropriada.</p>
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
