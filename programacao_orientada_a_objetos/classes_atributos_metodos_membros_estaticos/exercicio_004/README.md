<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>Employee.java</h2>
<pre>
<code>
    package entities;

    public class Employee {

        public String name;
        public double grossSalary;
        public double tax;

        public double netSalary() {
            return grossSalary - tax;
        }

        public void increaseSalary(double percentage) {
            grossSalary += (percentage / 100.0) * grossSalary;
        }

        @Override
        public String toString() {
            return name + ", R$ " + String.format("%.2f", netSalary());
        }
    }
</code>
    </pre>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import entities.Employee;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Employee employee = new Employee();

            System.out.print("Nome: ");
            employee.name = sc.nextLine();
            System.out.print("Salário Bruto: ");
            employee.grossSalary = sc.nextDouble();
            System.out.print("Imposto: ");
            employee.tax = sc.nextDouble();

            System.out.println("Funcionário: " + employee);
            System.out.print("Qual porcentagem para aumentar o salário? ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
            System.out.println("Dados atualizados: " + employee);

            sc.close();
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

<h2>Employee.java</h2>
<pre>
<code>
    package entities;

    public class Employee {

        public static String name;
        public static double grossSalary;
        public static double tax;

        public static double netSalary() {
            return grossSalary - tax;
        }

        public static void increaseSalary(double percentage) {
            grossSalary += (percentage / 100.0) * grossSalary;
        }

        public static String toStringStatic() {
            return name + ", R$ " + String.format("%.2f", netSalary());
        }
    }
</code>
    </pre>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import entities.Employee;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Nome: ");
            Employee.name = sc.nextLine();
            System.out.print("Salário Bruto: ");
            Employee.grossSalary = sc.nextDouble();
            System.out.print("Imposto: ");
            Employee.tax = sc.nextDouble();

            System.out.println("Funcionário: " + Employee.toStringStatic());
            System.out.print("Qual porcentagem para aumentar o salário? ");
            double percentage = sc.nextDouble();
            Employee.increaseSalary(percentage);
            System.out.println("Dados atualizados: " + Employee.toStringStatic());

            sc.close();
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Employee</code> pode representar um empregado específico com seu próprio nome, salário bruto e imposto. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
    <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos empregados sem interferência entre eles. Cada objeto <code>Employee</code> pode ter seu próprio estado e comportamento.</li>
    <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
</ul>
<p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como empregados, a abordagem instanciável é geralmente mais apropriada.</p>
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
