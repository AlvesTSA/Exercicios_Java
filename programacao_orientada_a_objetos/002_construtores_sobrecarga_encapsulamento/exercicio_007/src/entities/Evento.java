package entities;

import java.time.LocalDate;

public class Evento {

    private String nome;
    private String local;
    private LocalDate data;
    private String pacote;
    private double valorBase;

    public Evento(String nome, LocalDate data, String local,String pacote,double valorBase){

        this.nome = nome;
        this.data = data;
        this.local = local;
        this.pacote = pacote;
        this.valorBase = valorBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        if (valorBase < 0) {
            throw new IllegalArgumentException("O valor base não pode ser negativo.");
        }
        this.valorBase = valorBase;
    }

    public double calcularValorTotal(){

        return valorBase + valorBase*0.10;
    }
    public double calcularValorTotal(double valorBuffer){

        return valorBase + valorBuffer + valorBase*0.10;
    }
    public double calcularValorTotal(double valorBuffer, double valorDJ){

        return valorBase + valorDJ + valorBuffer + valorBase*0.10;
    }

    public String toString(){

        return 
            "\n\nEvento: " + nome +
            "\nData: " + data +
            "\nLocal: " + local +
            "\nPacote: " + pacote;   
    }
}
