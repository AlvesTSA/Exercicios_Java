package entities;

public class ContaBancaria {

    public int numero_conta;
    public String nome_titular;
    public float saldo;
    public static final float taxa_juros = 0.05F;

    public void depositar(float valor){

        saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
        System.out.printf("Novo saldo: %.2f\n\n",saldo);
    }

    public void sacar(float valor){

        if (valor > saldo) {
            
            System.out.println("ERRO: Saldo insuficiente!");
            System.out.printf("Saldo atual: %.2f\n\n",saldo);
        }
        else{
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.printf("Novo saldo: %.2f\n\n",saldo);
        }
    }

    public float consultar_saldo(){

        return saldo;
    }

    public String toString(){

        return 
        String.format("Conta criada com sucesso!\n")+
        String.format("Número da Conta: %d\n",numero_conta)+
        String.format("Nome do Titular: %s\n",nome_titular)+
        String.format("Saldo Inicial: %.2f\n",saldo)+
        String.format("Taxa de Juros: %.2f\n",ContaBancaria.taxa_juros);
    }
}