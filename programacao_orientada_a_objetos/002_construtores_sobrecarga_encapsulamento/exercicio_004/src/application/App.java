
import entities.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {

        ContaBancaria conta1 = new ContaBancaria("Maria Silva", 1000.00, 2000.00);
        System.out.println(conta1);
        System.out.println();
        System.out.println("Novo saldo: " + String.format("%.2f",conta1.depositar(500.00)));
        System.out.println();
        System.out.println("Novo saldo: " + String.format("%.2f",conta1.sacar(300.00)));
    }
}
