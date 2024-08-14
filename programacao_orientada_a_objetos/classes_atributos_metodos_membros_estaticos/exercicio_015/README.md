
<!DOCTYPE html>
<html>
<head>
    <title>Código com Membros Instanciáveis</title>
</head>
<body>
    <h1>Código com Membros Instanciáveis</h1>

<h2>App.java</h2>
    <pre>
<code>package application;

import java.util.Scanner;
import entities.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Veiculo carro1 = new Veiculo();

        System.out.print("Veículo: ");
        carro1.placa = sc.nextLine();
        System.out.print("Modelo: ");
        carro1.modelo = sc.nextLine();
        System.out.print("Ano: ");
        carro1.ano = sc.nextInt();
        System.out.print("Quilometragem: ");
        carro1.quilometragem = sc.nextFloat();
        Veiculo.total_veiculos++;

        carro1.registrar_quilometragem(2000F);
        System.out.println("Quilometragem: " + carro1.quilometragem);
        System.out.println();
        int idade = carro1.calcular_idade(2024);
        System.out.println("Idade: " + idade + " anos");
        System.out.println();
        System.out.println(carro1);
        System.out.println("Idade: " + idade + " anos");
        sc.close();
    }
}
</code>
    </pre>

 <h2>Veiculo.java</h2>
    <pre>
<code>package entities;

public class Veiculo {

    public String placa;
    public String modelo;
    public int ano;
    public float quilometragem;
    public static int total_veiculos = 0;

    public void registrar_quilometragem(float km) {
        System.out.println("\nRegistrando " + km + "...");
        quilometragem += km;
    }

    public int calcular_idade(int ano_atual) {
        System.out.println("Calculando idade em " + ano_atual + "...");
        return ano_atual - ano;
    }

    @Override
    public String toString() {
        return "Veículo: " + placa + 
               "\nModelo: " + modelo + 
               "\nAno: " + ano + 
               "\nQuilometragem: " + quilometragem + " Km";
    }
}
</code>
    </pre>
</body>
</html>


<!DOCTYPE html>
<html>
<head>
    <title>Código com Membros Estáticos</title>
</head>
<body>
    <h1>Código com Membros Estáticos</h1>

 <h2>App.java</h2>
    <pre>
<code>package application;

import java.util.Scanner;
import entities.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Veículo: ");
        Veiculo.placa = sc.nextLine();
        System.out.print("Modelo: ");
        Veiculo.modelo = sc.nextLine();
        System.out.print("Ano: ");
        Veiculo.ano = sc.nextInt();
        System.out.print("Quilometragem: ");
        Veiculo.quilometragem = sc.nextFloat();
        Veiculo.total_veiculos++;

        Veiculo.registrar_quilometragem(2000F);
        System.out.println("Quilometragem: " + Veiculo.quilometragem);
        System.out.println();
        int idade = Veiculo.calcular_idade(2024);
        System.out.println("Idade: " + idade + " anos");
        System.out.println();
        System.out.println(Veiculo.toStringStatic());
        System.out.println("Idade: " + idade + " anos");
        sc.close();
    }
}
</code>
    </pre>

<h2>Veiculo.java</h2>
    <pre>
<code>package entities;

public class Veiculo {

    public static String placa;
    public static String modelo;
    public static int ano;
    public static float quilometragem;
    public static int total_veiculos = 0;

    public static void registrar_quilometragem(float km) {
        System.out.println("\nRegistrando " + km + "...");
        quilometragem += km;
    }

    public static int calcular_idade(int ano_atual) {
        System.out.println("Calculando idade em " + ano_atual + "...");
        return ano_atual - ano;
    }

    public static String toStringStatic() {
        return "Veículo: " + placa + 
               "\nModelo: " + modelo + 
               "\nAno: " + ano + 
               "\nQuilometragem: " + quilometragem + " Km";
    }
}
</code>
    </pre>

 <h2>Qual Opção é Recomendada e Por Quê?</h2>
    <p>A opção recomendada é utilizar membros instanciáveis. Aqui estão as razões:</p>
    <ul>
        <li><b>Encapsulamento e Independência:</b> Cada instância da classe <code>Veiculo</code> pode representar um veículo específico com sua própria placa, modelo, ano e quilometragem. Isso é mais alinhado com os princípios da Programação Orientada a Objetos (POO), onde objetos representam entidades independentes com estado e comportamento próprios.</li>
        <li><b>Flexibilidade e Reusabilidade:</b> Permite criar múltiplos veículos sem interferência entre eles. Cada objeto <code>Veiculo</code> pode ter seu próprio estado e comportamento.</li>
        <li><b>Manutenção e Expansão:</b> Facilita a manutenção e a expansão do código no futuro, pois cada instância é independente e pode ser modificada sem afetar outras instâncias.</li>
    </ul>
    <p>A abordagem com membros estáticos pode ser útil em cenários onde a criação de instâncias não faz sentido ou onde os métodos são utilitários e não dependem do estado de um objeto. No entanto, para representar entidades distintas como veículos, a abordagem instanciável é geralmente mais apropriada.</p>
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
