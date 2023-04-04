//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;

public class exercicio_7 {
    
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida de um dos lados do quadrado");

        float medida = scanner.nextFloat();

        float area = (medida*medida)*2;

        System.out.println("O dobro da área é:  "+ area);

        scanner.close();

    }
}
