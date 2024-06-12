<!DOCTYPE html>
<html>

<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
<pre>
<code>
    package application;

    import java.util.Scanner;
    import entities.QuartoHotel;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            QuartoHotel qh = new QuartoHotel();

            System.out.print("Quarto: ");
            qh.numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Tipo: ");
            qh.tipo = sc.nextLine();
            System.out.print("Preço por noite: ");
            qh.preco_noite = sc.nextFloat();

            System.out.println(qh);

            qh.reservar();
            qh.liberar();

            sc.close();
        }
    }
</code>
    </pre>

<h2>QuartoHotel.java</h2>
<pre>
<code>
    package entities;

    public class QuartoHotel {
        
        public int numero;
        public String tipo;
        public float preco_noite;
        public boolean reservado = false;
        public static int total_reservas = 0;

        public void reservar() {
            total_reservas++;

            if (!reservado) {
                reservado = true;
                System.out.println("\nReservando o quarto...\nStatus: Reservado");
                System.out.println("Total de reservas: " + total_reservas);
            } else {
                System.out.println("\nReservando o quarto...\nStatus: Reservado");
                System.out.println("Total de reservas: " + total_reservas);
            }
        }

        public void liberar() {
            if (total_reservas != 0) {
                total_reservas--;
            }

            if (reservado) {
                reservado = false;
                System.out.println("\nLiberando o quarto...\nStatus: Disponível");
                System.out.println("Total de reservas: " + total_reservas);

                if (total_reservas == 0) {
                    System.out.println("Nenhum quarto para liberar");
                }
            } else {
                System.out.println("\nLiberando o quarto...\nStatus: Disponível");
                System.out.println("Total de reservas: " + total_reservas);

                if (total_reservas == 0) {
                    System.out.println("Nenhum quarto para liberar");
                }
            }
        }

        @Override
        public String toString() {
            return String.format("\n\nQuarto: %d\nTipo: %s\nPreço por noite: %.2f\nStatus: %s\n",
                    numero, tipo, preco_noite, reservado ? "Reservado" : "Disponível");
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
    import entities.QuartoHotel;

    public class App {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Quarto: ");
            QuartoHotel.numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Tipo: ");
            QuartoHotel.tipo = sc.nextLine();
            System.out.print("Preço por noite: ");
            QuartoHotel.preco_noite = sc.nextFloat();

            System.out.println(QuartoHotel.toStringStatic());

            QuartoHotel.reservar();
            QuartoHotel.liberar();

            sc.close();
        }
    }
</code>
    </pre>

<h2>QuartoHotel.java</h2>
<pre>
<code>
    package entities;

    public class QuartoHotel {
        
        public static int numero;
        public static String tipo;
        public static float preco_noite;
        public static boolean reservado = false;
        public static int total_reservas = 0;

        public static void reservar() {
            total_reservas++;

            if (!reservado) {
                reservado = true;
                System.out.println("\nReservando o quarto...\nStatus: Reservado");
                System.out.println("Total de reservas: " + total_reservas);
            } else {
                System.out.println("\nReservando o quarto...\nStatus: Reservado");
                System.out.println("Total de reservas: " + total_reservas);
            }
        }

        public static void liberar() {
            if (total_reservas != 0) {
                total_reservas--;
            }

            if (reservado) {
                reservado = false;
                System.out.println("\nLiberando o quarto...\nStatus: Disponível");
                System.out.println("Total de reservas: " + total_reservas);

                if (total_reservas == 0) {
                    System.out.println("Nenhum quarto para liberar");
                }
            } else {
                System.out.println("\nLiberando o quarto...\nStatus: Disponível");
                System.out.println("Total de reservas: " + total_reservas);

                if (total_reservas == 0) {
                    System.out.println("Nenhum quarto para liberar");
                }
            }
        }

        public static String toStringStatic() {
            return String.format("\n\nQuarto: %d\nTipo: %s\nPreço por noite: %.2f\nStatus: %s\n",
                    numero, tipo, preco_noite, reservado ? "Reservado" : "Disponível");
        }
    }
</code>
    </pre>

<h2>Qual Opção é Recomendada e Por Quê?</h2>
<p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
<ul>
    <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>QuartoHotel</code> pode representar um quarto específico com seu próprio número, tipo, preço por noite e status de reserva. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
    <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos quartos sem interferência entre eles. Cada objeto <code>QuartoHotel</code> pode ter seu próprio estado e comportamento.</li>
    <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
</ul>
<p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como quartos de hotel, a abordagem instanciável é geralmente mais apropriada.</p>
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
