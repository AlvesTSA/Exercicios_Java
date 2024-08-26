<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import entities.Venda;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Venda venda = new Venda();

            System.out.print("Venda: ");
            venda.codigo = sc.nextInt();
            sc.nextLine();
            System.out.print("Data: ");
            venda.data = sc.nextLine();
            System.out.print("Valor Total: ");
            venda.valor_total = sc.nextFloat();

            System.out.println(venda);
            System.out.println();

            venda.registrar_pagamento();
            venda.cancelar_venda();

            sc.close();
        }
    }
</code>
    </pre>

<h2>Venda.java</h2>
<pre>
<code>
    package entities;

    public class Venda {

        public int codigo;
        public String data;
        public float valor_total;
        public boolean pago = false;
        public static int total_vendas = 0;

        public void registrar_pagamento() {
            if (!pago) {
                total_vendas++;
                pago = true;
                System.out.println("Registrando pagamento...\nStatus: Pago");
                System.out.println("Total de vendas: " + total_vendas + "\n");
            }
        }

        public void cancelar_venda() {
            if (pago) {
                pago = false;
                total_vendas--;
                System.out.println("Cancelando venda...\nVenda já paga, não pode ser cancelada");
            }
        }

        @Override
        public String toString() {
            return String.format("\nVenda: %d\nData: %s\nValor Total: %.2f\nStatus: %s\n",
                    codigo, data, valor_total, pago ? "Pago" : "Não pago");
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
    import entities.Venda;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Venda: ");
            Venda.codigo = sc.nextInt();
            sc.nextLine();
            System.out.print("Data: ");
            Venda.data = sc.nextLine();
            System.out.print("Valor Total: ");
            Venda.valor_total = sc.nextFloat();

            System.out.println(Venda.toStringStatic());
            System.out.println();

            Venda.registrar_pagamento();
            Venda.cancelar_venda();

            sc.close();
        }
    }
</code>
    </pre>

<h2>Venda.java</h2>
<pre>
<code>
    package entities;

    public class Venda {

        public static int codigo;
        public static String data;
        public static float valor_total;
        public static boolean pago = false;
        public static int total_vendas = 0;

        public static void registrar_pagamento() {
            if (!pago) {
                total_vendas++;
                pago = true;
                System.out.println("Registrando pagamento...\nStatus: Pago");
                System.out.println("Total de vendas: " + total_vendas + "\n");
            }
        }

        public static void cancelar_venda() {
            if (pago) {
                pago = false;
                total_vendas--;
                System.out.println("Cancelando venda...\nVenda já paga, não pode ser cancelada");
            }
        }

        public static String toStringStatic() {
            return String.format("\nVenda: %d\nData: %s\nValor Total: %.2f\nStatus: %s\n",
                    codigo, data, valor_total, pago ? "Pago" : "Não pago");
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Venda</code> pode representar uma venda específica com seu próprio código, data, valor total e status de pagamento. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
    <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplas vendas sem interferência entre elas. Cada objeto <code>Venda</code> pode ter seu próprio estado e comportamento.</li>
    <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
</ul>
<p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como vendas, a abordagem instanciável é geralmente mais apropriada.</p>
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
