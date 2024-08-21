package entities;

import java.time.LocalDate;

public class Compra {

    public int numero;
    public LocalDate data;
    public boolean entregue = false;
    public float valor_total;
    public static int total_compras = 0;

    public void registrar_entrega(){

        System.out.println("Registrando entrega...");
        entregue = true;
        total_compras++;
    }

    public void cancelar_compra(){

        System.out.println("Cancelando compra...");
        if (entregue == true) {
            System.out.println("Compra ja entregue, nao pode ser cancelada");
        }
        else{
            System.out.println("Compra cancelada...");
            entregue = false;
            total_compras--;
        }
    }
}