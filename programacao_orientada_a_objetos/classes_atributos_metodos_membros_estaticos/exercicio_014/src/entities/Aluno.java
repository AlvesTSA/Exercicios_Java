package entities;
import java.util.ArrayList;
import java.util.List;

public class Aluno {

    public int matricula;
    public String nome;
    public String curso;
    public List<Float> notas = new ArrayList<>();
    public static int total_alunos = 0;

    public void adicionar_nota(float nota){

        System.out.println("Adicionando nota " + nota + "...");
        notas.add(nota);
    }

    public void remover_nota(float nota){

        System.out.println("Removendo nota " + nota + "...");
        notas.remove(nota);
    }

    public float calcular_media(){

        float soma = 0;

        System.out.println("Calculando media... ");

        for (float nota : notas) {
            
            soma += nota;
        }
        
        return soma / notas.size();
    }

    public String toString(){

        return 
            "\nAluno: " + matricula + 
            "\nNome: " + nome + 
            "\nCurso: " + curso + 
            "\nNotas: " + notas;
    }
}


