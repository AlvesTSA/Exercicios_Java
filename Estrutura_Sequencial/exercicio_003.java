//Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

public class exercicio_003 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");

        float numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");

        float numero2 = scanner.nextFloat();

        float soma = numero1 + numero2;

        System.out.print("A soma e igual a: " + soma);

        scanner.close();

    }
    
}
