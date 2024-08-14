package application;

import java.util.Scanner;

import entities.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Veiculo carro1 = new Veiculo();

        System.out.print("Veiculo: ");
        carro1.placa = sc.nextLine();
        System.out.print("modelo: ");
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
