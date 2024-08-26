import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite os dados da pessoa.\n");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        Pessoa p1 = new Pessoa(nome, idade);
        System.out.println();
        System.out.println(p1);
       
        sc.close();
    }
}
