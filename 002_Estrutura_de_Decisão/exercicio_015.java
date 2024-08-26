/* Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.

Dicas:
 
Três lados formam um triangulo quando a soma de quaisquer dos dois lados é maior que o terceiro; 
 
Triângulo Equilátero: três lados iguais; 

Triângulo Isósceles: quaisquer dois lados iguais;
 
Triângulo Escaleno: três lados diferentes.*/

import java.util.Scanner;

public class exercicio_015 {
    
    public static void main(String[] args){

        float lado_a = 0;
        float lado_b = 0;
        float lado_c = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os lados do triângulo:");
        lado_a = scanner.nextFloat(); 
        lado_b = scanner.nextFloat();
        lado_c = scanner.nextFloat();

        if ((lado_a + lado_b) > lado_c && (lado_b + lado_c) > lado_a && (lado_a + lado_c) > lado_b && lado_a > 0 && lado_b > 0 && lado_c > 0){

            if (lado_a == lado_b && lado_a == lado_c && lado_b == lado_c){

                System.out.println("Triângulo equilátero");
            
            }
            else if (lado_a == lado_b || lado_a == lado_c || lado_b == lado_c){
                
                System.out.println("Triângulo isósceles");

            }
            else if (lado_a != lado_b && lado_a != lado_c && lado_b != lado_c){
                
                System.out.println("Triângulo escaleno");

            }
            
        }
        else{

            System.out.println("Os valores informados não formam um triângulo, reinicie o programa e tente novamente.");

        }

        scanner.close();
    }
}
