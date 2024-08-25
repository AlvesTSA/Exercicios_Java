<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>  package application;

    import java.util.Scanner;
    import entities.Product;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Product product = new Product();
            System.out.println("Enter product data:");
            System.out.print("Name: ");
            product.name = sc.nextLine();
            System.out.print("Price: ");
            product.price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            product.quantity = sc.nextInt();
            System.out.println("Product data: " + product);
            System.out.println();

            System.out.print("Enter the number of products to be added in stock: ");
            int add = sc.nextInt();
            product.addProducts(add);

            System.out.println("Updated data: " + product);
            System.out.println();

            System.out.print("Enter the number of products to be removed from stock: ");
            int remove = sc.nextInt();
            product.removeProducts(remove);

            System.out.println("Updated data: " + product);
            System.out.println();

            sc.close();
        }
    }
</code>
    </pre>

<h2>Product.java</h2>
<pre>
<code>package entities;

    public class Product {

        public String name;
        public double price;
        public int quantity;

        public double totalValueInStock() {
            return price * quantity;
        }

        public void addProducts(int quantity) {
            this.quantity += quantity;
        }

        public void removeProducts(int quantity) {
            this.quantity -= quantity;
        }

        @Override
        public String toString() {
            return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
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
<code>package application;

    import java.util.Scanner;
    import entities.Product;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter product data:");
            System.out.print("Name: ");
            Product.name = sc.nextLine();
            System.out.print("Price: ");
            Product.price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            Product.quantity = sc.nextInt();
            System.out.println("Product data: " + Product.toStringStatic());
            System.out.println();

            System.out.print("Enter the number of products to be added in stock: ");
            int add = sc.nextInt();
            Product.addProducts(add);

            System.out.println("Updated data: " + Product.toStringStatic());
            System.out.println();

            System.out.print("Enter the number of products to be removed from stock: ");
            int remove = sc.nextInt();
            Product.removeProducts(remove);

            System.out.println("Updated data: " + Product.toStringStatic());
            System.out.println();

            sc.close();
        }
    }
</code>
    </pre>

<h2>Product.java</h2>
<pre>
<code>
    package entities;

    public class Product {

        public static String name;
        public static double price;
        public static int quantity;

        public static double totalValueInStock() {
            return price * quantity;
        }

        public static void addProducts(int quantity) {
            Product.quantity += quantity;
        }

        public static void removeProducts(int quantity) {
            Product.quantity -= quantity;
        }

        public static String toStringStatic() {
            return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
        }
    }
</code>
    </pre>
</body>
</html>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
    <p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
    <ul>
        <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Product</code> pode representar um produto específico com seu próprio nome, preço e quantidade. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
        <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos produtos sem interferência entre eles. Cada objeto <code>Product</code> pode ter seu próprio estado e comportamento.</li>
        <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
    </ul>
    <p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como produtos, a abordagem instanciável é geralmente mais apropriada.</p>



## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sourcesc
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
