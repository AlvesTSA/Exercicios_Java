/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.*/

import java.util.Scanner;

public class exercicio_019{

    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        int op = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois números: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("Escolha a operação\n\n[1]Adição\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n");
        op = scanner.nextInt();

        switch (op){
        case 1:

            resultado = num1 + num2;

            break;
        
        case 2:
        
            resultado = num1 - num2;

            break;
        
        case 3:

            resultado = num1*num2;
        
            break;
        
        case 4:

            if(num2 == 0){

                System.out.println("Não existe divisão por zero.");
            
                System.exit(0);

            }
            else{

                resultado = num1/num2;

            }

            break;
        
        default:

            System.out.println("Informe uma opção válida.");

            System.exit(0);

            break;
        }

        if(resultado % 2 == 0){

            if(resultado > 0){

                System.out.println("Resultado: " + resultado + "  é par e positivo."); 

            }
            else if(resultado == 0){

                System.out.println("Resultado: " + resultado + "  é par e neutro.");

            }
            else{

                System.out.println("Resultado: " + resultado + "  é par e negativo.");
            }
        }
        else{

            if(resultado < 0){

                System.out.println("Resultado: " + resultado + "  é impar e negativo.");
            }
            else{

                System.out.println("Resultado: " + resultado + "  é impar e positivo.");
            }
        } 
        
        scanner.close();
    }

}