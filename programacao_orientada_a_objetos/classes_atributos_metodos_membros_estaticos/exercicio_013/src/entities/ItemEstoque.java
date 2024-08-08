package entities;

public class ItemEstoque {

    public int codigo;
    public String nome;
    public int quantidade;
    public float preco_unitario;
    public static int total_itens_estoque = 0; 

    public void adicionar_itens(int quantidade) {
        this.quantidade += quantidade;
        total_itens_estoque += this.quantidade;
        System.out.println("Adicionando " + quantidade + " itens...");
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Total em Estoque: " + total_itens_estoque);
    }

    public void remover_itens(int quantidade) {
        this.quantidade -= quantidade;
        total_itens_estoque -= quantidade;
        System.out.println("Removendo " + quantidade + " itens...");
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Total em Estoque: " + total_itens_estoque);
    }
    
}
