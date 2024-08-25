<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import entities.Student;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Student st = new Student();

            System.out.println("Informe seu nome e as tres notas:\n");
            st.name = sc.nextLine();

            for (int i = 0; i < 3; i++) {
                double note = sc.nextDouble();
                st.calculateGrade(note);
            }

            System.out.println(st);

            sc.close();
        }
    }
</code>
    </pre>

<h2>Student.java</h2>
<pre>
<code>
    package entities;

    public class Student {

        public String name;
        public double note;
        private double lack;

        public void calculateGrade(double note) {
            this.note += note;
            lack = 60 - this.note;
        }

        @Override
        public String toString() {
            if (this.note < 60) {
                return String.format("\nFINAL GRADE = %.2f\n", this.note) +
                    String.format("FAILED\n") +
                    String.format("MISSING %.2f POINTS\n", lack);
            } else {
                return String.format("\nFINAL GRADE = %.2f\n", this.note) +
                    String.format("PASS\n");
            }
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
    import entities.Student;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Informe seu nome e as tres notas:\n");
            Student.name = sc.nextLine();

            for (int i = 0; i < 3; i++) {
                double note = sc.nextDouble();
                Student.calculateGradeStatic(note);
            }

            System.out.println(Student.toStringStatic());

            sc.close();
        }
    }
</code>
    </pre>

<h2>Student.java</h2>
<pre>
<code>
    package entities;

    public class Student {

        public static String name;
        public static double note;
        private static double lack;

        public static void calculateGradeStatic(double note) {
            Student.note += note;
            lack = 60 - Student.note;
        }

        public static String toStringStatic() {
            if (Student.note < 60) {
                return String.format("\nFINAL GRADE = %.2f\n", Student.note) +
                    String.format("FAILED\n") +
                    String.format("MISSING %.2f POINTS\n", lack);
            } else {
                return String.format("\nFINAL GRADE = %.2f\n", Student.note) +
                    String.format("PASS\n");
            }
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Student</code> pode representar um estudante específico com seu próprio nome e notas. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
    <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos estudantes sem interferência entre eles. Cada objeto <code>Student</code> pode ter seu próprio estado e comportamento.</li>
    <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
</ul>
<p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como estudantes, a abordagem instanciável é geralmente mais apropriada.</p>
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
