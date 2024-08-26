<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import entities.Funcionario;

    public class App {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            Funcionario fun = new Funcionario();

            System.out.print("Funcionário: ");
            fun.matricula = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            fun.nome = sc.nextLine();
            System.out.print("Cargo: ");
            fun.cargo = sc.nextLine();
            System.out.println("Horas Trabalhadas: 0");

            fun.registrar_entrada(8);
            System.out.println("\n");
            fun.registrar_saida(5);
            sc.close();
        }
    }
</code>
    </pre>

<h2>Funcionario.java</h2>
<pre>
<code>
    package entities;

    public class Funcionario {
        
        public int matricula;
        public String nome;
        public String cargo;
        public int horas_trabalhadas;
        public static int total_horas_trabalhadas = 0;
    
        public void registrar_entrada(int horas) {
            horas_trabalhadas += horas;
            total_horas_trabalhadas += horas;
            System.out.println("Registrando entrada de " + horas + " horas...");
            System.out.println("Horas Trabalhadas: " + horas_trabalhadas);
            System.out.println("Total de horas trabalhadas: " + total_horas_trabalhadas);
        }

        public void registrar_saida(int horas) {
            horas_trabalhadas -= horas;
            total_horas_trabalhadas -= horas;
            System.out.println("Registrando saída de " + horas + " horas...");
            System.out.println("Horas Trabalhadas: " + horas_trabalhadas);
            System.out.println("Total de horas trabalhadas: " + total_horas_trabalhadas);
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
    import entities.Funcionario;

    public class App {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Funcionário: ");
            Funcionario.matricula = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            Funcionario.nome = sc.nextLine();
            System.out.print("Cargo: ");
            Funcionario.cargo = sc.nextLine();
            System.out.println("Horas Trabalhadas: 0");

            Funcionario.registrar_entrada(8);
            System.out.println("\n");
            Funcionario.registrar_saida(5);
            sc.close();
        }
    }
</code>
    </pre>

<h2>Funcionario.java</h2>
<pre>
<code>
    package entities;

    public class Funcionario {
        
        public static int matricula;
        public static String nome;
        public static String cargo;
        public static int horas_trabalhadas = 0;
        public static int total_horas_trabalhadas = 0;
    
        public static void registrar_entrada(int horas) {
            horas_trabalhadas += horas;
            total_horas_trabalhadas += horas;
            System.out.println("Registrando entrada de " + horas + " horas...");
            System.out.println("Horas Trabalhadas: " + horas_trabalhadas);
            System.out.println("Total de horas trabalhadas: " + total_horas_trabalhadas);
        }

        public static void registrar_saida(int horas) {
            horas_trabalhadas -= horas;
            total_horas_trabalhadas -= horas;
            System.out.println("Registrando saída de " + horas + " horas...");
            System.out.println("Horas Trabalhadas: " + horas_trabalhadas);
            System.out.println("Total de horas trabalhadas: " + total_horas_trabalhadas);
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Funcionario</code> pode representar um funcionário específico com sua própria matrícula, nome, cargo e horas trabalhadas. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
    <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos funcionários sem interferência entre eles. Cada objeto <code>Funcionario</code> pode ter seu próprio estado e comportamento.</li>
    <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
</ul>
<p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como funcionários, a abordagem instanciável é geralmente mais apropriada.</p>
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
