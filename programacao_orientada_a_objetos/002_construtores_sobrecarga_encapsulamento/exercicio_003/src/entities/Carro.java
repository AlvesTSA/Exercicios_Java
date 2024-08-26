package entities;

public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca,String modelo,int ano){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca,String modelo){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2024;
    }

    public String getMarca(){

        return marca;
    }
    public void setMarca(String marca){

        this.marca = marca;
    }

    public String getModelo(){

        return modelo;
    }
    public void setModelo(String modelo){

        this.modelo = modelo;
    }

    public int getAno(){

        return ano;
    }
    public void setAno(int ano){

        this.ano = ano;
    }

    public String toString(){

        return marca + ", " + 
            modelo + 
            ", Ano: " + ano;
    }
}
