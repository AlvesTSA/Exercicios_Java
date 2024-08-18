package entities;

import java.time.LocalDate;

public class Pedido {

    public int numero;
    public LocalDate data;
    public float valor_total;
    public boolean pago = false;
    public static int total_pedidos = 0;

    public void registrar_pagamento(){

        System.out.println("Registrando pagamento...");
        pago = true;
        total_pedidos++;
    }

    public void cancelar_pedido(){

        System.out.println("Cancelando pedido...");

        if ( pago == true) {
            
            System.out.println("Pedido ja pago, nao pode ser cancelado");
        }
        else{
            System.out.println("Pedido cancelado com sucesso.");

            if (total_pedidos == 0) {
                total_pedidos = 0;
            }
            else{
                total_pedidos--;
            }
        }
    }
}