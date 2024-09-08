package entities;

public class Funcionario {
    
    private String nome;
    private String cargo = "Desenvolvedor";
    private double salario = 7000.00;

    public Funcionario(String nome,String cargo,double salario){

        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public Funcionario(String nome,String cargo){

        this.nome = nome;
        this.cargo = cargo;
    }
    public Funcionario(String nome){

        this.nome = nome;
    }

    public String getNome(){

        return nome;
    }
    public void setNome(String nome){

        this.nome = nome;
    }

    public String getCargo(){

        return cargo;
    }
    public void setCargo(String cargo){

        this.cargo = cargo;
    }

    public double getSalario(){

        return salario;
    }
    public void setSalario(double salario){

        this.salario= salario;
    }

    public void ajustarSalario(double percentual){
        
        salario += salario*(percentual/100);
        System.out.printf(" - Novo salário: %.2f (%.0f%% de aumento)",salario,percentual);
    }

    public String toString(){

        return
                "Nome: " + nome + 
                "\nCargo: " + cargo + 
                "\nSalário: " + String.format("%.2f",salario);
    }
}
