package entities;

public class QuartoHotel {
    
    public int numero;
    public String tipo;
    public float preco_noite;
    public boolean reservado = false;
    public static int total_reservas = 0;
   

    public void reservar(){

        total_reservas++;

        if (!reservado) {
            
            reservado = true;
            System.out.println("\nReservando o quarto...\nStatus: Reservado");
            System.out.println("Total de reservas: "+total_reservas);
        }
        else{

            System.out.println("\nReservando o quarto...\nStatus: Reservado");
            System.out.println("Total de reservas: "+total_reservas);
        }

    }

    public void liberar(){

        if (total_reservas != 0) {
            total_reservas--;
        }
        
        if (reservado) {
            
            reservado = false;
            System.out.println("\nLiberando o quarto...\nStatus: Disponível");
            System.out.println("Total de reservas: "+total_reservas);

            if (total_reservas == 0) {
                System.out.println("Nenhum quarto para liberar");
            }
        }
        else{

            System.out.println("\nLiberando o quarto...\nStatus: Disponível");
            System.out.println("Total de reservas: "+total_reservas);

            if (total_reservas == 0) {
                System.out.println("Nenhum quarto para liberar");
            }
        }  
    }

    public String toString(){

        return String.format("\n\nQuarto: %d\nTipo: %s\nPreço por noite: %.2f\nStatus: Disponível\n",numero,tipo,preco_noite);
    }
}
