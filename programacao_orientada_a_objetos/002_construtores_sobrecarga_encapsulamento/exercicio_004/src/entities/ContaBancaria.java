package entities;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private double limite; 


    public ContaBancaria(String titular,double saldo,double limite){

        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getTitular(){

        return titular;
    }
    public void setTitular(String titular){

        this.titular = titular;
    }

    public double getSaldo(){

        return saldo;
    }
    public void setSaldo(double saldo){

        this.saldo = saldo;
    }

    public String getLimite(){

        return titular;
    }
    public void setLimite(double limite){

        this.limite = limite;
    }

    public double depositar(double valor){

        System.out.println("Depósito: " + String.format("%.2f", valor));
        return this.saldo += valor;
    }
    public double sacar(double valor){

        System.out.println("Saque: " + String.format("%.2f", valor));
        return this.saldo -= valor;
    }

    public String toString(){

        return "Titular: " + titular + 
                "\nSaldo: " + String.format("%.2f", saldo) + 
                "\nLimite: " + String.format("%.2f", limite);
    }
}
