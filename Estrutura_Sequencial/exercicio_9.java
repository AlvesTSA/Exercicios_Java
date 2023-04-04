//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.C = 5 * ((F-32) / 9).
import java.util.Scanner;

public class exercicio_9 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:  ");

        float F = scanner.nextFloat();

        float C = 5 * ((F-32) / 9);

        System.out.println("A temperatura em Celsius é: " + C + "°" );

        scanner.close();

    }
}
