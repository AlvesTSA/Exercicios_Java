<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import entities.Livro;

    public class App {
        public static void main(String[] args) {

            Livro livro = new Livro();

            System.out.println(livro);
            livro.emprestar();
            livro.devolver();
        }
    }
</code>
    </pre>

<h2>Livro.java</h2>
<pre>
<code>
    package entities;

    public class Livro {
        
        public String titulo = "1984";
        public String autor = "George Orwell";
        public int ano_publicacao = 1949;
        public boolean emprestado = false;
        public static int total_emprestimo = 0;

        public void emprestar() {
            if (!emprestado) {
                emprestado = true;
                total_emprestimo++;
                System.out.println("Emprestando livro...\nStatus: Emprestado");
                System.out.println("Total de empréstimos: " + total_emprestimo + "\n");
            }
        }

        public void devolver() {
            if (emprestado) {
                emprestado = false;
                total_emprestimo--;
                System.out.println("Devolvendo livro...\nStatus: Disponível");
                System.out.println("Total de empréstimos: " + total_emprestimo + "\n");
            }
        }

        @Override
        public String toString() {
            return String.format("\nLivro: %s de %s\nAno de publicação: %d\nStatus: %s\n", titulo, autor, ano_publicacao, emprestado ? "Emprestado" : "Disponível");
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

    import entities.Livro;

    public class App {
        public static void main(String[] args) {

            System.out.println(Livro.toStringStatic());
            Livro.emprestar();
            Livro.devolver();
        }
    }
</code>
    </pre>

<h2>Livro.java</h2>
<pre>
<code>
    package entities;

    public class Livro {
        
        public static String titulo = "1984";
        public static String autor = "George Orwell";
        public static int ano_publicacao = 1949;
        public static boolean emprestado = false;
        public static int total_emprestimo = 0;

        public static void emprestar() {
            if (!emprestado) {
                emprestado = true;
                total_emprestimo++;
                System.out.println("Emprestando livro...\nStatus: Emprestado");
                System.out.println("Total de empréstimos: " + total_emprestimo + "\n");
            }
        }

        public static void devolver() {
            if (emprestado) {
                emprestado = false;
                total_emprestimo--;
                System.out.println("Devolvendo livro...\nStatus: Disponível");
                System.out.println("Total de empréstimos: " + total_emprestimo + "\n");
            }
        }

        public static String toStringStatic() {
            return String.format("\nLivro: %s de %s\nAno de publicação: %d\nStatus: %s\n", titulo, autor, ano_publicacao, emprestado ? "Emprestado" : "Disponível");
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Livro</code> pode representar um livro específico com seu próprio título, autor, ano de publicação e status de empréstimo. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
    <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos livros sem interferência entre eles. Cada objeto <code>Livro</code> pode ter seu próprio estado e comportamento.</li>
    <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é


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
