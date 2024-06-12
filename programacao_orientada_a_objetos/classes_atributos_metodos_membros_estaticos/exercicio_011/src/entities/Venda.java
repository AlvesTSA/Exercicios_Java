package entities;

public class Venda {
    
    public int codigo;
    public String data;
    public float valor_total;
    public boolean pago = false;
    public static int total_vendas = 0;

    public void registrar_pagamento(){

        if (!pago) {
            
            total_vendas++;

            pago = true;
            System.out.println("Registrando pagamento...\nStatus: Pago");
            System.out.println("Total de vendas: "+total_vendas + "\n");
        }
        
    }

    public void cancelar_venda(){

        if (pago) {
            
            pago = false;

            System.out.println("Cancelando venda...\nVenda já paga, não pode ser cancelada");
        }
    }

    public String toString(){

        return String.format("\nVenda: %d\nData: %s\nValor Total: %.2f\nStatus: Não pago\n",codigo,data,valor_total);
    }
}
