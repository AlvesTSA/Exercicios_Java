package application;

import java.util.Scanner;
import entities.ItemEstoque;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ItemEstoque ite = new ItemEstoque();

        System.out.print("Item: ");
        ite.nome = sc.nextLine();
        System.out.print("Codigo: ");
        ite.codigo = sc.nextInt();
        System.out.print("Preco unitario: ");
        ite.preco_unitario = sc.nextFloat();
        System.out.print("Quantida: ");
        ite.quantidade = sc.nextInt();
        System.out.print("Total em Estoque: "+ ite.quantidade);
        System.out.println();
        ite.adicionar_itens(5);
        System.out.println();
        ite.remover_itens(3);

        
        sc.close();
    }
}
