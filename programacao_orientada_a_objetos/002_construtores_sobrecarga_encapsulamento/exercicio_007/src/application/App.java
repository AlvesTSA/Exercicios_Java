import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import entities.Evento;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Evento: ");
        String nome = sc.nextLine();
        System.out.print("Data: ");
        String data_in = sc.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(data_in, formato);
        System.out.print("Local: ");
        String local = sc.nextLine();
        System.out.print("Pacote: ");
        String pacote = sc.nextLine();
        Evento evento1 = new Evento(nome, date, local, pacote, 2000.00);
        
        System.out.print("Evento: ");
        nome = sc.nextLine();
        System.out.print("Data: ");
        data_in = sc.nextLine();
        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = LocalDate.parse(data_in, formato);
        System.out.print("Local: ");
        local = sc.nextLine();
        System.out.print("Pacote: ");
        pacote = sc.nextLine();
        Evento evento2 = new Evento(nome, date, local, pacote, 2000.00);

        System.out.print("Evento: ");
        nome = sc.nextLine();
        System.out.print("Data: ");
        data_in = sc.nextLine();
        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = LocalDate.parse(data_in, formato);
        System.out.print("Local: ");
        local = sc.nextLine();
        System.out.print("Pacote: ");
        pacote = sc.nextLine();
        Evento evento3 = new Evento(nome, date, local, pacote, 2000.00);
        
        System.out.println(evento1);
        System.out.printf("Valor total: %.2f",evento1.calcularValorTotal(2000.00,1000.00));

        System.out.println(evento2);
        System.out.printf("Valor total: %.2f",evento2.calcularValorTotal());

        System.out.println(evento3);
        System.out.printf("Valor total: %.2f",evento3.calcularValorTotal(2000.00));
        sc.close();
    }
}
