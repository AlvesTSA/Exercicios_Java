import java.util.Scanner;
import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Produto 1: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preco: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        Produto p1 = new Produto(nome, preco, quantidade);
        System.out.println();
        System.out.println("Produto 2: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Preco: ");
        preco = sc.nextDouble();
        Produto p2 = new Produto(nome, preco);
        System.out.println();
        System.out.println("Dados dos produtos:");
        System.out.println("Produto 1: " + p1);
        System.out.println("Produto 2: " + p2);
        System.out.println();
        sc.close();
    }
}
