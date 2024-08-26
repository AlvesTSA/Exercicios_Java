/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:

Para homens: (72.7*h) - 58

Para mulheres: (62.1*h) - 44.7 */

import java.util.Scanner;

public class exercicio_013 {
    
    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         System.out.print("Informe sua altura: ");
         double h = scanner.nextDouble();

         double peso_homem = (72.7*h) - 58;
         double peso_mulher = (62.1*h) - 44.7;

         System.out.println("Peso ideal para homens: " + peso_homem + "Kg");
         System.out.println("Peso ideal para mulheres: " + peso_mulher + "Kg");

         scanner.close();


    }
}
