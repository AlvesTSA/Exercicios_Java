/* Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:

A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 

A mensagem "Reprovado", se a média for menor do que sete; 

A mensagem "Aprovado com Distinção", se a média for igual a dez.

 */

import java.util.Scanner;

public class exercicio_005 {

    public static void main(String[] args){

        float nota1 = 0;
        float nota2 = 0;
        float media = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe suas duas notas:");
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();

        media = (nota1 + nota2)/2;

        if (media > 0 && media < 7) {
            
            System.out.print("REPROVADO !");

        }

        else if (media >= 7 && media < 10) {

            System.out.print("APROVADO !");
            
        }

        else if (media == 10){

            System.out.print("APROVADO COM DISTINÇÃO !");

        }

        else{

            System.out.print("Nota inválida");
        }

        scanner.close();
    }
    
}
