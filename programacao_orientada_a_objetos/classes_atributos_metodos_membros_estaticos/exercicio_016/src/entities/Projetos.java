package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Projetos {

    public int codigo;
    public String nome;
    public LocalDate data_inicio;
    public LocalDate data_termino;
    public static int total_projetos = 0;

    public int calcular_duracao(){

        System.out.println("Calculando duracao...");
        return (int) ChronoUnit.DAYS.between(data_inicio, data_termino);
    }

    public boolean verificar_ativo(String data_atual){

        System.out.println("Verificando se esta ativo em " + data_atual);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(data_atual, formatter);
        return !data.isBefore(data_inicio) && !data.isAfter(data_termino);
    }

}

