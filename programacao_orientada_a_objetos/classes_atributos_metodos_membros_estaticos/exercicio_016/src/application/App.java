package application;

import entities.Projetos;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Projetos projeto1 = new Projetos();

        System.out.print("Projeto: ");
        projeto1.codigo = sc.nextInt();
        System.out.print("Nome: ");
        projeto1.nome = sc.nextLine();
        sc.nextLine();
        System.out.print("Data de inicio: ");
        String data_i = sc.nextLine();
        System.out.print("Data de termino: ");
        String data_f = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        projeto1.data_inicio = LocalDate.parse(data_i, formatter);
        projeto1.data_termino = LocalDate.parse(data_f, formatter);
        Projetos.total_projetos++;
        System.out.println();
        int duracao = projeto1.calcular_duracao();
        System.out.println("Duracao: " + duracao);
        System.out.println();
        boolean status = projeto1.verificar_ativo("2023-06-10");

        if (status == false) {
            System.out.println("Ativo: Nao");
        }
        else{
            System.out.println("Ativo: Sim");
        }

        System.out.println();
        System.out.println("Total de prejetos: " + Projetos.total_projetos);
        
        sc.close();
    }
}
