package entities;

public class Funcionario {
    
    public int matricula;
    public String nome;
    public String cargo;
    public int horas_trabalhadas;
    public static int total_horas_trabalhadas = 0;
   
    public void registrar_entrada(int horas){

        horas_trabalhadas = horas;
        total_horas_trabalhadas += horas_trabalhadas;
        System.out.println("Registrando entrada de " + horas_trabalhadas + " horas...");
        System.out.println("Horas Trabalhadas: " + horas_trabalhadas);
        System.out.println("Total de horas trabalhadas: " + total_horas_trabalhadas);
    }

    public void registrar_saida(int horas){

        horas_trabalhadas = horas;
        total_horas_trabalhadas -= horas_trabalhadas;
        System.out.println("Registrando saída de " + horas_trabalhadas + " horas...");
        System.out.println("Horas Trabalhadas: " + total_horas_trabalhadas);
        System.out.println("Total de horas trabalhadas: " + total_horas_trabalhadas);
    }
}
