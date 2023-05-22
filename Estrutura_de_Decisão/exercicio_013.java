/*. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1- Domingo , 2- Segunda, etc). Se digitar outro valor, deve aparecer “valor inválido.*/

import java.util.Scanner;

public class exercicio_013 {

    public static void main(String[] args){

        int dia = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor de 1 a 7: ");
        dia = scanner.nextInt();

        switch (dia){

        case 2:
            System.out.println("SEGUNDA");

            break;
        
        case 3:
            System.out.println("TERÇA FEIRA");
            
            break;
        
        case 4:
            System.out.println("QUARTA FEIRA");
            
            break;
        
        case 5:
            System.out.println("QUINTA FEIRA");
            
            break;

        case 6:
            System.out.println("SEXTA FEIRA");
            
            break;

        case 7:
            System.out.println("SABADO");
            
            break;
        
        case 1:
            System.out.println("DOMINGO");
            
            break;
        
        default:
            System.out.println("VALOR INVÁLIDO");

            break;
        }

        scanner.close();
    }
    
}
