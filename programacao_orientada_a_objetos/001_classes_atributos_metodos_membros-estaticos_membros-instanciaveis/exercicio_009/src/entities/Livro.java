package entities;

public class Livro {
    
    public String titulo = "1964";
    public String autor = "George Orwell";
    public int ano_publicacao = 1949;
    public boolean emprestado = false;
    public static int total_emprestimo = 0;

    public void emprestar(){

        total_emprestimo++;

        if (!emprestado) {

            emprestado = true;
            System.out.println("Emprestando livro...\nStatus: Emprestado");
            System.out.println("Total de emprestimo: "+total_emprestimo + "\n");
        }
    }

    public void devolver(){

        total_emprestimo--;

        if (emprestado) {
            System.out.println("Devolvendo livro...\nStatus: Disponível");
            System.out.println("Total de emprestimo: "+total_emprestimo + "\n");
        }
    }

    public String toString(){

        return String.format("\nLivro: %s de %s\nAno de publicação: %d\nStatus: disponivel\n",titulo,autor,ano_publicacao);
    }
}
