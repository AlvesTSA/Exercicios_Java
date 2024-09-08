import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario fun1 = new Funcionario("Carlos","Analista",5000.00);
        Funcionario fun2 = new Funcionario("Ana","Desenvolvedora");
        System.out.println("Funcionário 1: ");
        System.out.println(fun1);
        System.out.println();
        System.out.println("Funcionário 2: ");
        System.out.println(fun2);
        System.out.println();
        System.out.println("Ajuste de salário:");
        System.out.print("Funcionário 1: ");
        fun1.ajustarSalario(10.0);
        System.out.println();
        System.out.print("Funcionário 2: ");
        fun2.ajustarSalario(5.0);
        System.out.println();
    }
}
